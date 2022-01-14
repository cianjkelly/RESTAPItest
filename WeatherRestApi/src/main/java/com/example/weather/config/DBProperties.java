package com.fiserv.merchantmaintenance.config;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.iv.RandomIvGenerator;
import org.jasypt.properties.EncryptableProperties;
import org.jasypt.salt.RandomSaltGenerator;
import org.springframework.stereotype.Component;

import java.util.Properties;

@EnableEncryptableProperties
@Component
public class DBProperties {

    private String url;
    private String username;
    private String password;
    private int pool;
    private int minimumIdle;

    public DBProperties() {

    }

    public DBProperties(String url, String username, String password, String encryptionPassword, String poolSize, String minIdle) {
        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        encryptor.setAlgorithm("PBEWITHHMACSHA512ANDAES_256");
        encryptor.setPoolSize(1);
        encryptor.setSaltGenerator(new RandomSaltGenerator());
        encryptor.setKeyObtentionIterations(1000);
        encryptor.setPassword(encryptionPassword);
        encryptor.setStringOutputType("base64");
        encryptor.setIvGenerator(new RandomIvGenerator());

        Properties props = new EncryptableProperties(encryptor);
        props.put("password", password);


        this.setUrl(url);
        this.setUsername(username);
        this.setPassword(props.getProperty("password"));
        this.setPool(Integer.parseInt(poolSize));
        this.setMinimumIdle(Integer.parseInt(minIdle));
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPool() {
        return pool;
    }

    public void setPool(int pool) {
        this.pool = pool;
    }

    public int getMinimumIdle() {
        return minimumIdle;
    }

    public void setMinimumIdle(int minimumIdle) {
        this.minimumIdle = minimumIdle;
    }
}