package com.company;

public class TestAuthor {
    public void TestAuthor() {
        Author a1 = new Author("Mikasa", "mikasa.a@gmail.com", 'F');
        Author a2 = new Author("Tristan", "sotarks@gmail.ru", 'm');
        Author a3 = new Author("Dean", "peppy@gmail.com", 'm');

        System.out.println("1.\t" + a1);
        System.out.println("2.\t" + a2);
        System.out.println("3.\t" + a3);
    }
}