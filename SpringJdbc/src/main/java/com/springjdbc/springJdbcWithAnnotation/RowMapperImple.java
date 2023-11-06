package com.springjdbc.springJdbcWithAnnotation;

import com.springjdbc.SelectingWholeTable.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImple implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

        Student st = new Student();
        st.setId(rs.getInt(1));
        st.setName(rs.getString(2));
        st.setEmail(rs.getString(3));
        st.setAge(rs.getInt(4));
        st.setStatus(rs.getInt(5));
        return st;
    }
}
