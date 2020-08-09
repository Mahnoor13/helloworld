package com.company.triangle.Rectanglebykeyboard;

public class rectangle {
    private int length;
    private int breadth;
    rectangle(){

    }
   public void setid(int l,int b){
        this.length = l;

        this.breadth = b;
   }
   public int getarea(){

        int result = this.length *this.breadth;
        return result;
   }

}
