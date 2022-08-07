package com.firstpackage;

import java.util.Scanner;

public class ArrayTwoDimm {
    public static void main(String[] args) {
        // 3 classes and 4 students marks
        int[][] a = new int[3][4];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("Please enter marks for class" + " " + i+ " Student "+ j );
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("Marks are as following:");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    System.out.print(a[i][j] + " ");
                }
        }
    }
}