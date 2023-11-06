package com.springjdbc.SelectingWholeTable;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImpl implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();

        student.setId(rs.getInt(1));
        student.setAge(rs.getInt(4));
        student.setName(rs.getString(2));
        student.setEmail(rs.getString(3));
        student.setStatus(rs.getInt(5));

        return student;

    }
}
