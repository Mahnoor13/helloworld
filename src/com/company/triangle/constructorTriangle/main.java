package com.company.triangle.constructorTriangle;


public class main {
    public static void main(String[] args) {

        Triangle t = new Triangle(2,3,5);
        System.out.println( t.calcultaarea(t.getSide1(),t.getSide2(),t.getSide3()));
    }
}
