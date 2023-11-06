package com.springjdbc.insertDatausingXmlAndMain;

import com.springjdbc.insertDataUsingCompletelyXml.Jdbc;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImple implements Studentdao{

    JdbcTemplate temp;

    public int insert(Jdbc Jdbc){
        String insertQuery = "insert into Jdbc (id, name, address) values(?,?,?)";
        int r = temp.update(insertQuery, Jdbc.getId(), Jdbc.getName(), Jdbc.getAddress());
        return r;
    }

    public JdbcTemplate getTemp() {
        return temp;
    }

    public void setTemp(JdbcTemplate temp) {
        this.temp = temp;
    }
}
