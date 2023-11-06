package com.springjdbc.springJdbcWithAnnotation;

import com.springjdbc.SelectingWholeTable.RowMapperImpl;
import com.springjdbc.SelectingWholeTable.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class StudentDaoImplement implements StudentDao{

    JdbcTemplate jdbcTemplate = new JdbcTemplate();

    public List<Student> select(){
        String query = "Select * from student";
        RowMapper rowMapper = new RowMapperImpl();
        List<Student> result = jdbcTemplate.query(query, rowMapper);
        return result;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
