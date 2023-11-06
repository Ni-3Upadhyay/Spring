package com.springjdbc.updateAndDeleteUsingSpringjdbc;

import com.springjdbc.insertDataUsingCompletelyXml.Jdbc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String [] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("new.xml");
        JdbcDao obj = context.getBean("C",JdbcDao.class);

       Jdbc object1 = new Jdbc();
//        object1.setAddress("Champawat");
//        object1.setName("Rahul");
//        object1.setId(59);
//
//        int result = obj.change(object1);
//        System.out.print("the object updated successfully : "+ result);

        object1.setId(5);
        int result = obj.change(object1);
        System.out.print("the object deleted successfully : "+ result);
    }
}
