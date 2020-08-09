package com.company.triangle.getteraSetterTriangle;

public class Triangle {

    private int side1;
    private int side2;
    private int side3;

    public Triangle() {
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    public void calculateArea(int num1, int num2, int num3 ){
        int sum = num1*num2*num3;
        System.out.println(sum);
    }
    public void calculatePerimeter(int num1, int num2, int num3 ){
        int sum = num1+num2+num3;
        System.out.println(sum);
    }
}
