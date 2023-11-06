package com.springjdbc.springJdbcWithAnnotation;

import com.springjdbc.SelectingWholeTable.Student;

import java.util.List;

public interface StudentDao {

    public List<Student> select();
}
