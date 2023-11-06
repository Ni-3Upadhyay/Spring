package com.newspringtry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main(String[] args)
    {
        System.out.println("hello");

        ApplicationContext context =new ClassPathXmlApplicationContext("file.xml");     // location of xml file and file must be stored in resources
        first student1=(first)context.getBean("student");           // student is name of the bean and conversion to the class

        System.out.println(student1);

        first student2 = (first)context.getBean("student2");
        System.out.println(student2);
    }

}

