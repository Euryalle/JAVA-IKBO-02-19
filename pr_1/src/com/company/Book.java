package com.company;

public class Book {
    private String name, author;

    public Book(){
        name = "Без названия";
        author = "Отсутствует";
    }

    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }


    @Override
    public String toString() {
        return "Книга " + name + " автора " + author;
    }
}
