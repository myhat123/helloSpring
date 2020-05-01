package com.mine.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;

@Configuration
@ComponentScan("com.mine.service")
public class AppConfig {
    // @Bean
    // public DataSource dataSource() {
    //     DriverManagerDataSource dataSource = new DriverManagerDataSource();
    //     dataSource.setDriverClassName("org.postgresql.Driver");
    //     dataSource.setUrl("jdbc:postgresql://localhost:5432/money");
    //     dataSource.setUsername("hjh");
    //     dataSource.setPassword("1234");
 
    //     return dataSource;
    // }

    // @Bean
    // public DataSource dataSource() 
    // {
    //     DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
    //     dataSourceBuilder.driverClassName("org.postgresql.Driver");
    //     dataSourceBuilder.url("jdbc:postgresql://localhost:5432/money");
    //     dataSourceBuilder.username("hjh");
    //     dataSourceBuilder.password("1234");
    //     return dataSourceBuilder.build();
    // }

    @Bean
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }
}