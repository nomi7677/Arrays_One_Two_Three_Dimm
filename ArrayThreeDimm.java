package com.firstpackage;

import java.util.Scanner;

public class ArrayThreeDimm {
    public static void main(String[] args) {
        // 3 schools, 2 classes, 3 students so regular not jagged
        int[][][] arr = new int[3][2][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println(" Marks for School " + " " + i + " class " + j + " Students " + k);
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
                System.out.println(" Marks are as following: ");
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        for (int k = 0; k < arr[i][j].length; k++) {
                            System.out.print(arr[i][j][k] + " ");
                        }
                        System.out.println();
                    }
                }
            }
        }
