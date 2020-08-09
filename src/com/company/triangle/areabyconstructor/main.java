package com.company.triangle.areabyconstructor;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println("enter the value of length");
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        System.out.println("enter the value of breadth");
        Scanner s1 = new Scanner(System.in);
        int breadth = s.nextInt();
    rectangle r = new rectangle(length,breadth);
        System.out.println(r.getArea());
    }
}
