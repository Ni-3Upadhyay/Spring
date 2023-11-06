package com.springjdbc.updateAndDeleteUsingSpringjdbc;

import com.springjdbc.insertDataUsingCompletelyXml.Jdbc;

public interface JdbcDao {
    public int change(Jdbc jdbc);
    public int delete(Jdbc jdbc);
}
