package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main_task4 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Димка\\IdeaProjects\\lab_8\\test.txt";
        String text = "\nSotarks maps are so garbage that they breaks osu\n";
        try {
            Files.write(Paths.get(filePath), text.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("The algorithm is done");
    }
}