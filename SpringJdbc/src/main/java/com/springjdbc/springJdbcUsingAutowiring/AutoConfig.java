package com.springjdbc.springJdbcUsingAutowiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.springjdbc.springJdbcUsingAutowiring"})
public class AutoConfig {
    @Bean
    public DataSource getdataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();

        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/youtube");
        ds.setUsername("root");
        ds.setPassword("nitin");
        return ds;
    }

    @Bean
    public JdbcTemplate getJdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();

        jdbcTemplate.setDataSource(getdataSource());
        return jdbcTemplate;
    }
}
