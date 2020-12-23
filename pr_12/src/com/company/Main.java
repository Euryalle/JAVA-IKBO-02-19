package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //task 4
        String buf;
        number rus = new number();
        Scanner in = new Scanner(System.in);

        buf = in.nextLine();
        rus.getNumber(buf);
        buf = rus.translateNumber();

        System.out.println(buf);
        //task 1
        Person ps =new Person("","Dmitriy","Andreevich");
        System.out.println(ps.GetFIO());
        Person ps1 =new Person("Hohlov","","Andreevich");
        System.out.println(ps1.GetFIO());
        Person ps2 =new Person("Hohlov","Dmitriy","");
        System.out.println(ps2.GetFIO());
    }
}
