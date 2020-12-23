package com.company;

public class Person {
    private final String SurName;
    private final String Name;
    private final String LastName;

    Person(String F, String I, String O){
        SurName = F;
        Name = I;
        LastName = O;
    }
    public String GetFIO(){
        String FIO="";
        if(!SurName.isEmpty()){
            FIO += SurName+" ";
        }
        if(!Name.isEmpty()){
            FIO += Name+" ";
        }
        if(!LastName.isEmpty()){
            FIO += LastName;
        }
        return FIO;
    }
}
