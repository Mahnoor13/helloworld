package com.company.triangle.areabyconstructor;

public class rectangle {
    private int length;
    private  int breadth;
    rectangle(int l ,int b){
     this.length = l;
     this.breadth = b;

    }
    public int getArea(){
        int result = this.length* this.breadth;
        return result;

    }
}
