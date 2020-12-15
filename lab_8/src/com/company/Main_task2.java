package com.company;

import java.io.*;

public class Main_task2 {
    public static void main(String[] args) {

        try (FileReader read = new FileReader("test.txt")) {
            int c;
            while ((c = read.read()) != -1) {

                System.out.print((char) c);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}


