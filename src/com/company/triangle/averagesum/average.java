package com.company.triangle.averagesum;

public class average {
    private int num1;
    private int num2;
    private int num3;
     private int average;
    public void calculateAverage(int num, int num2, int num3) {
        this.num1 = num;
        this.num2 = num2;
        this.num3 = num3;
         average = (num + num2 + num3) / 3;

    }
     public int printAverage(){

        return average;

}

}