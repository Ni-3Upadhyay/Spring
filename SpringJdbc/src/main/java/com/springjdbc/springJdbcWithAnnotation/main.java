package com.springjdbc.springJdbcWithAnnotation;

import com.springjdbc.SelectingWholeTable.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class main {

    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        StudentDao studentDao=context.getBean("C",StudentDao.class);

        List<Student> students = studentDao.select();

        for(Student st : students){
            System.out.println(st);
        }
    }
}
