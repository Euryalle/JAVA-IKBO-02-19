package com.company;

import java.util.Scanner;

public class Task1 {
    public static int count() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 1) {
            int m = in.nextInt();
            if (m == 1) {
                return count() + n + m;
            } else {
                int k = in.nextInt();
                if (k == 1) {
                    return count() + n + m + k;
                } else {
                    return n + m + k;
                }
            }
        } else {
            int m = in.nextInt();
            if (m == 1) {
                return count() + n + m;
            } else {
                return n + m;
            }
        }
    }
}