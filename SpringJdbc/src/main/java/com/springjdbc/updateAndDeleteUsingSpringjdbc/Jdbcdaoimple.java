package com.springjdbc.updateAndDeleteUsingSpringjdbc;

import com.springjdbc.insertDataUsingCompletelyXml.Jdbc;
import org.springframework.jdbc.core.JdbcTemplate;

public class Jdbcdaoimple implements JdbcDao{
    public JdbcTemplate jdbcTemplate;
    public int change(Jdbc jdbc) {
        String query = "update jdbc set name=? , address = ? where id= ?";
        int r = this.jdbcTemplate.update(query, jdbc.getName(), jdbc.getAddress(), jdbc.getId());
        return r;
    }

    public int delete(Jdbc jdbc){
        String query = "delete from jdbc where id= ?";
        int r =this.jdbcTemplate.update(query,jdbc.getId());
        return r;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
}
