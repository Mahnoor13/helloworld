package com.company.triangle.Rectangle;

public class Rectangle {
    private int side1;
    private int side2;
    Rectangle(int s1,int s2){
        this.side1 = s1;
        this.side2 = s2;
    }
    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }


    public int calculaterectanglearea(int side1,int side2){
        int result = side1* side2;
        return result;



    }
}
