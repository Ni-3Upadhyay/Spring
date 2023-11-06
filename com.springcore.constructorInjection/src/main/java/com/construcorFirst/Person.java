package com.construcorFirst;

public class Person {
    private String name;
    private int id;
    private Certi Certi;

    public Person(String name, int id, Certi Certi){
        this.name = name;
        this.id = id;
        this.Certi = Certi;
    }

    public Person(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "id of a person is " + this.id + "\nname of the person is " + this.name + "\nCertificate name"+ this.Certi.name + " : " +this.Certi.certificateId;
    }


}
