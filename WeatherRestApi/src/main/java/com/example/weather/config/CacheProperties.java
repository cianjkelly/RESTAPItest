package com.fiserv.merchantmaintenance.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import java.util.HashMap;
import java.util.Map;

@Validated
@Data
@ConfigurationProperties(prefix = "com.fiserv.acquirerprofile")
public class CacheProperties {
    private Map<String, CacheConfig> cache = new HashMap<>();

    @Data
    public static class CacheConfig {
        private int timeToIdle;
        private int timeToLive;
        private int maxEntriesLocalHeap;
    }
}
