package com.com.springcore;

public class ReferenceA {
    private String x;
    private ReferenceB obj;

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public ReferenceB getObj() {
        return obj;
    }

    public void setObj(ReferenceB obj) {
        this.obj = obj;
    }


    public ReferenceA() {
        super();
    }

    public String toString(){
        return "x = " + x + "y = " + obj ;
    }
}
