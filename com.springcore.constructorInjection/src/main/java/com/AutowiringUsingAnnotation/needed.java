package com.AutowiringUsingAnnotation;

public  class needed {
    private int need1;
    private String need2;

    private char need3;

    public void setNeed3(char need3) {
        this.need3 = need3;
    }

    public void setNeed2(String need2) {
        this.need2 = need2;
    }

    public void setNeed1(int need1) {
        this.need1 = need1;
    }

    public int getNeed1() {
        return need1;
    }

    public char getNeed3() {
        return need3;
    }

    public String getNeed2() {
        return need2;
    }

    public String toString(){
        return "needed : " + need1 + " : " + need2 + " : " + need3;
    }

    public needed (){
        super();
    }

    public needed(int need1, String need2, char need3){
        this.need3 = need3;
        this.need2 = need2;
        this.need1 = need1;
    }

}