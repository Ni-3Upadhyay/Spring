package com.springjdbc.SelectingWholeTable;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public interface StudentDao {

    public List<Student> selectAll();
}
