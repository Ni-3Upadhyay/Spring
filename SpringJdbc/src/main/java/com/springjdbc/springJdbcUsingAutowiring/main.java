package com.springjdbc.springJdbcUsingAutowiring;

import com.springjdbc.SelectingWholeTable.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class main {
    public static void main(String [] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);

        StudentDao st = context.getBean("students",StudentDao.class);

        List<Student> student = st.selectAllRows();

        for(Student s: student){
            System.out.println(s);
        }
    }
}
