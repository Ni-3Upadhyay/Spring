package com.construcorFirst;

public class Certi {
     String name;       // private is not used as setter function is not used
                        // without setter function private variables can not be used
    int certificateId;

    public Certi(String name, int certificateId){
        this.name = name;
        this.certificateId = certificateId;
    }

    public String toString(){
        return "certi" + this.name + " : " + this.certificateId;
    }
}
