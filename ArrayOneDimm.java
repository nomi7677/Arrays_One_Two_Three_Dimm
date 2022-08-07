package com.firstpackage;

import java.util.Scanner;

public class ArrayOneDimm {
    public static void main(String[] args) {
        int[] arr= new int [5];

        Scanner sc = new Scanner(System.in);

        for (int i=0; i<5;i++){
            System.out.println("enter marks for students"+ " "+ i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Marks of students are as following:");

        for(int i=0; i<5; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
