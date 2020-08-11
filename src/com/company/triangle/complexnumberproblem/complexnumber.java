package com.company.triangle.complexnumberproblem;

public class complexnumber {
    private int realNo1;
    private int complexNumber1;
    private int realNo2;
    private int ComplexNumber2;

    public void sum(int rNo1, int rNo2, int complexNo, int complexNo2) {
        this.realNo1 = rNo1;
        this.realNo2 = rNo2;
        this.complexNumber1 = complexNo;
        this.ComplexNumber2 = complexNo2;
        int sumOf_RealPart = rNo1 + rNo2;
        int sumOf_ComplexPart = complexNo + complexNo2;
        //return sumOf_RealPart sumOf_ComplexPart;
        System.out.println("Sum of two complex number is");
        System.out.println(sumOf_RealPart + "+" + sumOf_ComplexPart + "i");
    }

    public void sub(int rNo1, int rNo2, int complexNo, int complexNo2) {
        this.realNo1 = rNo1;
        this.realNo2 = rNo2;
        this.complexNumber1 = complexNo;
        this.ComplexNumber2 = complexNo2;
        int subOf_RealPart = rNo1 - rNo2;
        int subOf_ComplexPart = complexNo - complexNo2;
        //return sumOf_RealPart sumOf_ComplexPart;
        System.out.println("Sub of two complex number is");
        System.out.println(subOf_RealPart + "+" + subOf_ComplexPart + "i");


    }
    public void multiply(int rNo1, int rNo2, int complexNo, int complexNo2){
        this.realNo1 = rNo1;
        this.realNo2 = rNo2;
        this.complexNumber1 = complexNo;
        this.ComplexNumber2 = complexNo2;
        int first = rNo1*rNo2;
        int outers = rNo1*complexNo2;
        int inners = complexNo*rNo2;
        int combination= outers+ inners;
        int last = (complexNo *complexNo2)* -1;
        int combo = first + last;
        System.out.println("Product of two complex number is");
        String result = combo + "+" + combination+"i"  ;
        System.out.println(result);


    }

}