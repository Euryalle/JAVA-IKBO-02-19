package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nЗАДАНИЕ 1");
        System.out.println(Task1.count());
        System.out.println("\nЗАДАНИЕ 2");
        Task2();
        System.out.println("\nЗАДАНИЕ 3");
        Task3();
        System.out.println("\nЗАДАНИЕ 3");
        Task4(123456789);
        System.out.println("\nЗАДАНИЕ 4");
        Task5(123456789);
    }

    static void Task2(){//12
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n != 0) {
            if (n % 2 != 0)
                System.out.println(n);
            Task2();
        }
    }

    static void Task3(){//13
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n != 0) {
            System.out.println(n);
            if (scanner.nextInt() != 0)
                Task3();
        }
    }

    static void Task4(int n){//14
        int out = n%10;
        n = n / 10;
        if(n != 0)
            Task4(n);
        System.out.print(out + " ");
    }
    static void Task5(int n){//15
        int out = n%10;
        n = n / 10;
        System.out.print(out  + " ");
        if(n!=0)
            Task5(n);
    }
}
