package com.springjdbc.springJdbcUsingAutowiring;

import com.springjdbc.SelectingWholeTable.Student;

import java.util.List;

public interface StudentDao {

    public List<Student> selectAllRows();
}
