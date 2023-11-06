package com.springjdbc.springJdbcWithAnnotation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class Config {

    @Bean
    public DataSource getDataSource(){
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

        jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate;
    }

    @Bean("C")
    public StudentDao getStudentdao(){
        StudentDaoImplement studentDao = new StudentDaoImplement();

        studentDao.setJdbcTemplate(getJdbcTemplate());
        return studentDao;
    }
}
