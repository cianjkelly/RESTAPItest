package com.fiserv.merchantmaintenance.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "db")
public class DataSourceProperties {
    private Map<Object,Object> dataSources = new HashMap<>();

    public Map<Object,Object> getDataSources(){
        return this.dataSources;
    }

    public void setDataSources(Map<String,Map<String,String>> dataSources){
        dataSources.forEach((key,value) -> this.dataSources.put(key,convert(value)));
    }

    public DataSource convert(Map<String,String> source){
        DBProperties ds = new DBProperties(source.get("jdbcUrl"), source.get("username"), source.get("password"), "Omni_Pay", source.get("maximum-pool-size"), source.get("minimumIdle"));
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(ds.getUrl());
        config.setUsername(ds.getUsername());
        config.setPassword(ds.getPassword());
        config.setMaximumPoolSize(ds.getPool());
        config.setMinimumIdle(ds.getMinimumIdle());
        return new HikariDataSource(config);
    }
}
