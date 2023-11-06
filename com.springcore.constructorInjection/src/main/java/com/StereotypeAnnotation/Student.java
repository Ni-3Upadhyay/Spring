package com.StereotypeAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("object")
public class Student {
    @Value("Nitin Upadhyay")
    private String studentName;
    @Value("34")
    private int studentId;

    public int getStudentId(){
        return studentId;
    }

    public void setStudentId(int studentId){
        this.studentId = studentId;
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public String toString(){
        return "Student : " + studentName + " : " + studentId;
    }
}
