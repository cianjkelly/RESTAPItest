package com.fiserv.merchantmaintenance.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfiguration {
   private final DataSourceProperties dataSourceProperties;

   @Value("${default.datasource.name}")
   private Object defaultDatabaseEnv;

   public DatabaseConfiguration(DataSourceProperties dataSourceProperties){
       this.dataSourceProperties = dataSourceProperties;
   }
   @Bean
    public DataSource dataSource(){
       RoutingDataSource routingDataSource = new RoutingDataSource();
       routingDataSource.setTargetDataSources(dataSourceProperties.getDataSources());
       routingDataSource.setDefaultTargetDataSource(dataSourceProperties.getDataSources().get(defaultDatabaseEnv));
       routingDataSource.afterPropertiesSet();
       return routingDataSource;
   }
}
