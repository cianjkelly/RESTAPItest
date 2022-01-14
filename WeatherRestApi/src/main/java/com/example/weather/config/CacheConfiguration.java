package com.fiserv.merchantmaintenance.config;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import javax.cache.CacheManager;
import javax.cache.Caching;

import org.ehcache.config.builders.CacheConfigurationBuilder;
import org.ehcache.config.builders.CacheEventListenerConfigurationBuilder;
import org.ehcache.config.builders.ExpiryPolicyBuilder;
import org.ehcache.config.builders.ResourcePoolsBuilder;
import org.ehcache.core.config.DefaultConfiguration;
import org.ehcache.core.events.CacheEventListenerConfiguration;
import org.ehcache.jsr107.EhcacheCachingProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.jcache.JCacheCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(CacheProperties.class)
public class CacheConfiguration extends CachingConfigurerSupport {

	@Autowired
	private CacheProperties cacheProperties;

	@Bean
	@Override
	public org.springframework.cache.CacheManager cacheManager() {
		return new JCacheCacheManager(createCacheManager());
	}

	private CacheManager createCacheManager() {
		Map<String, org.ehcache.config.CacheConfiguration<?, ?>> caches = createCacheConfigurations();
		EhcacheCachingProvider provider = getCachingProvider();
		DefaultConfiguration configuration = new DefaultConfiguration(caches, getClassLoader());
		return getCacheManager(provider, configuration);
	}

	private Map<String, org.ehcache.config.CacheConfiguration<?, ?>> createCacheConfigurations() {
		Map<String, org.ehcache.config.CacheConfiguration<?, ?>> caches = new HashMap<>();
		cacheProperties.getCache().forEach((k, v) -> {
			CacheEventListenerConfiguration cacheEventListenerConfiguration = CacheEventListenerConfigurationBuilder
					.newEventListenerConfiguration(new CacheListener(), org.ehcache.event.EventType.CREATED,
							org.ehcache.event.EventType.EXPIRED, org.ehcache.event.EventType.REMOVED,
							org.ehcache.event.EventType.UPDATED)
					.unordered().asynchronous().build();

			org.ehcache.config.CacheConfiguration<String, Object> cacheConfiguration = CacheConfigurationBuilder
					.newCacheConfigurationBuilder(String.class, Object.class,
							ResourcePoolsBuilder.heap(v.getMaxEntriesLocalHeap()))
					.withExpiry(ExpiryPolicyBuilder.timeToLiveExpiration(Duration.ofSeconds(v.getTimeToLive())))
					.withExpiry(ExpiryPolicyBuilder.timeToIdleExpiration(Duration.ofSeconds(v.getTimeToIdle())))
					.withService(cacheEventListenerConfiguration).build();
			caches.put(k, cacheConfiguration);
		});
		return caches;
	}

	private ClassLoader getClassLoader() {
		return this.getClass().getClassLoader();
	}

	private CacheManager getCacheManager(EhcacheCachingProvider provider, DefaultConfiguration configuration) {
		return provider.getCacheManager(provider.getDefaultURI(), configuration);
	}

	private EhcacheCachingProvider getCachingProvider() {
		return (EhcacheCachingProvider) Caching.getCachingProvider();
	}

}
