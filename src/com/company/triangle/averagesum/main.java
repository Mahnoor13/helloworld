package com.company.triangle.averagesum;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("enter num 1");
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        System.out.println("enter num 2");
        Scanner s1 = new Scanner(System.in);
        int num2 = s1.nextInt();
        System.out.println("enter num 3");
        Scanner s2 = new Scanner(System.in);
        int num3 = s2.nextInt();
        average a = new average();
        a.calculateAverage(num1,num2,num3);
        System.out.println("Result");
        System.out.println(a.printAverage());

    }
}
