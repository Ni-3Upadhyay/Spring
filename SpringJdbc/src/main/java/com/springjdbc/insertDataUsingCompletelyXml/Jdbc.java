package com.springjdbc.insertDataUsingCompletelyXml;

public class Jdbc {
    public int id;
    public String name;
    public String address;

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public Jdbc(){
        super();
    }

    public Jdbc(int id, String name, String address){
        this.address = address;
        this.name = name;
        this.id = id;
    }

    public String toString(){
        return "jdbc : " + name + " : " + id + " : " + address;
    }
}
