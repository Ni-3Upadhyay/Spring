package com.springjdbc.SelectingWholeTable;

import com.springjdbc.insertDataUsingCompletelyXml.Jdbc;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class StudentDaoImpl implements  StudentDao{

    JdbcTemplate jdbcTemplate;
    @Override
    public List<Student> selectAll() {
        String query = "select * from student";
        RowMapperImpl rowMapperImpl = new RowMapperImpl();
        List<Student> result = this.jdbcTemplate.query(query, rowMapperImpl);
        return result;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
}
