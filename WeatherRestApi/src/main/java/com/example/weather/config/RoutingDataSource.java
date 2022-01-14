package com.fiserv.merchantmaintenance.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import com.fiserv.merchantmaintenance.web.ThreadEnvDBKeyStorage;

public class RoutingDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return ThreadEnvDBKeyStorage.getCurrentDBEnvironment();
    }
}
