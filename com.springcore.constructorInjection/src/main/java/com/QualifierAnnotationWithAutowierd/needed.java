package com.QualifierAnnotationWithAutowierd;

public class needed {
    private int id;
    private String name;

    private char gender;

    public char getGender() {
        return gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public needed(){
        super();
    }

    public needed(int id, char gender , String name){
        this.id = id;
        this.gender = gender;
        this.name = name;
    }

    public String toString(){
        return "needed : " + name + id + gender;
    }
}
