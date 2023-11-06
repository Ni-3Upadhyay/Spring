package com.springjdbc.SelctingOneRow;

import com.springjdbc.insertDataUsingCompletelyXml.Jdbc;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDaoImple implements StudentDao{

    JdbcTemplate jdbcTemplate;
    public Jdbc select(int Studentid){
        String query = "select * from jdbc where id=?";
        RowMapper<Jdbc> rowMapper = new RowMapperImpl();

        Jdbc row = this.jdbcTemplate.queryForObject(query, rowMapper, Studentid);
        return row;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
