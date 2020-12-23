package com.company;

public class number {
    String number;


    public void getNumber(String num){
        number = num;
    }

    public String translateNumber() {
        String Buf="";

        if(number.charAt(0) =='+'){
            Buf = number.substring(0,5)+'-'+number.substring(5,8)+'-'+number.substring(8);
        }
        else{
            Buf = number.replaceFirst("8","+7");
            Buf = Buf.substring(0,5)+'-'+Buf.substring(5,8)+'-'+Buf.substring(8);
        }

        return Buf;
    }

}
