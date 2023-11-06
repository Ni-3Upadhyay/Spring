package com.springjdbc.SelectingWholeTable;

public class Student {
    public int id;
    public String name;
    public String email;
    public int age;
    public int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getStatus() {
        return status;
    }

    public String getEmail() {
        return email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Student(){
        super();
    }

    public Student(int id, String name, String email, int age, int status ){
        this.id = id;
        this.age = age;
        this.name = name;
        this.email = email;
        this.status = status;
    }

    public String toString(){
        return "Student : "+ id +" "+ name +" " + age + " " + email +" " + status;
    }
}
