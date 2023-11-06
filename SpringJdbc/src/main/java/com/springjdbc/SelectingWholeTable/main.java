package com.springjdbc.SelectingWholeTable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class main {
    public static void main(String []args){
        ApplicationContext context = new ClassPathXmlApplicationContext("SelectAll.xml");
        StudentDao obj = context.getBean("C", StudentDao.class);


        List<Student> student = obj.selectAll();

        for(Student st : student){
            System.out.println(st);
        }
    }
}

