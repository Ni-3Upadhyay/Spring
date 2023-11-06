package com.springjdbc.insertDataUsingCompletelyXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.xml.transform.sax.TemplatesHandler;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Program Started");
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
        JdbcTemplate temp = context.getBean("jdbcTemplate", JdbcTemplate.class);

//        query to insert
        String insertQuery = "insert into jdbc(id, name, address) values(?, ?, ?)";

//        update
        int result = temp.update(insertQuery, 22, "Bhupender", "Haldwani");

        System.out.println("The value is successfully inserted" + result);
    }
}



