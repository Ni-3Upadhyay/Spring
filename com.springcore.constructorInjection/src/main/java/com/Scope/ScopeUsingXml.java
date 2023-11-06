package com.Scope;

import java.util.HashMap;

public class ScopeUsingXml {
    private String name;
    private HashMap<String, Integer> marks;

    public void setMarks(HashMap<String, Integer> marks) {
        this.marks = marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, Integer> getMarks() {
        return marks;
    }

    public String toString(){
        return "name : "+ name + marks;
    }
}
