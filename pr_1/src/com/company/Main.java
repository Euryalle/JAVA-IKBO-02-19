package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Ричи", 2);
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.AddAge();
        dog2.AddAge();
        dog3.AddAge();
        dog3.setName("микро-челик");

        System.out.println("\t"+dog1);
        System.out.println("\t"+dog2);
        System.out.println("\t"+dog3);

        Ball ball1 = new Ball(15);
        Ball ball2  = new Ball(2);
        Ball ball3 = new Ball();

        ball2.setWeigth(222);

        System.out.println("\t"+ball1);
        System.out.println("\t"+ball2);
        System.out.println("\t"+ball3);

        Book book1 = new Book("Kimi no Na wa", "Makoto Shinkai");
        Book book2 = new Book("Tenki no Ko", "Makoto Shinkai");
        Book book3 = new Book();

        System.out.println("\t"+book1);
        System.out.println("\t"+book2);
        System.out.println("\t"+book3);
    }
}