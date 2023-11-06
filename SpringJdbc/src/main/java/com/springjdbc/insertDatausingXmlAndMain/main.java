package com.springjdbc.insertDatausingXmlAndMain;

import com.springjdbc.insertDataUsingCompletelyXml.Jdbc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String [] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
        Studentdao obj = context.getBean("jdbcTempl",Studentdao.class);

        Jdbc object = new Jdbc();


        object.setId(5);
        object.setName("Mohit Upadhyay");
        object.setAddress("N A");

        int result = obj.insert(object);

        System.out.print("The object is " + result);

    }

}
