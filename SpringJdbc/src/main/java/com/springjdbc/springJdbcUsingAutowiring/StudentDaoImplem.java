package com.springjdbc.springJdbcUsingAutowiring;

import com.springjdbc.SelectingWholeTable.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("students")
public class StudentDaoImplem implements StudentDao{

    @Autowired
    JdbcTemplate jdbcTemplate = new JdbcTemplate();
    @Override
    public List<Student> selectAllRows() {
        String query = "select * from student";
        RowMapperImplemen rowMapper = new RowMapperImplemen();
        List<Student> student = this.jdbcTemplate.query(query, rowMapper);
        return student;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
}
