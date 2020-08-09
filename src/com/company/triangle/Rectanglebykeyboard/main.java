package com.company.triangle.Rectanglebykeyboard;

import com.company.triangle.Rectangle.Rectangle;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        System.out.println("Enter the value of length");
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        System.out.println("Enter the value of breadth");
        Scanner s1 = new Scanner(System.in);
        int breadth = s.nextInt();
        rectangle r = new rectangle();
        r.setid(length,breadth);
        System.out.println(r.getarea());
    }
}
