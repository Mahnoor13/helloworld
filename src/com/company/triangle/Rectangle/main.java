package com.company.triangle.Rectangle;

public class main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(3,5);
        Rectangle r1 =new Rectangle(5,6);
        System.out.println("Area of recttangle");
        System.out.println( r.calculaterectanglearea(r.getSide1(),r.getSide2()));
        System.out.println("Area of rectangle 2");
        System.out.println(r1.calculaterectanglearea(r1.getSide1(),r1.getSide2()));
    }
}
