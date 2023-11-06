package com.StereotypeAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentCollection {
    @Value("#{listOfmarks}")            // for collection value Standalone collection is formed and then id is called in @value
    private List<Integer> marks;        // calling id in @value "#{ this is necessary}"

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    public String toString(){
        return "marks : " + marks;
    }
}
