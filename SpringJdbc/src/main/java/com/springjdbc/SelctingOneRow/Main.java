package com.springjdbc.SelctingOneRow;

import com.springjdbc.insertDataUsingCompletelyXml.Jdbc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String [] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("select.xml");
        StudentDao object = context.getBean("C",StudentDao.class);

        Jdbc jdbc =object.select(41);

        System.out.println(jdbc);


    }
}
