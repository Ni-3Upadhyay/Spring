package com.StereotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

    public static void main(String [] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("stereo.xml");
        Student student = context.getBean("object", Student.class);
        StudentCollection marks = context.getBean("studentCollection", StudentCollection.class);


        System.out.println(marks);
        System.out.println(student);

        System.out.println(student.hashCode());
        Student student2 = context.getBean("object", Student.class);
        System.out.println(student2.hashCode());
    }
}
