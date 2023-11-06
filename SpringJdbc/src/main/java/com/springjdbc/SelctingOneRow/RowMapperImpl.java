package com.springjdbc.SelctingOneRow;

import com.springjdbc.insertDataUsingCompletelyXml.Jdbc;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImpl implements RowMapper<Jdbc> {
    @Override
    public Jdbc mapRow(ResultSet rs, int rowNum) throws SQLException {
        Jdbc jdbc = new Jdbc();
        jdbc.setId(rs.getInt(1));
        jdbc.setName(rs.getString(2));
        jdbc.setAddress(rs.getString(3));

        return jdbc;
    }
}
