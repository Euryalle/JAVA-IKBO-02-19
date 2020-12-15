package com.company;

import java.io.*;

public class Main_task1
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter(reader.readLine()));

        while (true) {
            String nextLine = reader.readLine();
            if (nextLine.equals("exit")) break;
            bw.write(nextLine);
        }
        reader.close();
        bw.close();
    }
}