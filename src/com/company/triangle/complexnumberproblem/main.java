package com.company.triangle.complexnumberproblem;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String string;
        do {
            System.out.println("Enter first Real no");
            Scanner s = new Scanner(System.in);
            int realNo1 = s.nextInt();

            System.out.println("Enter second Real no");
            Scanner s1 = new Scanner(System.in);
            int realNo2 = s1.nextInt();

            System.out.println("Enter first complex no");
            Scanner s2 = new Scanner(System.in);
            int complexno1 = s2.nextInt();

            System.out.println("Enter second complex no");
            Scanner s3 = new Scanner(System.in);
            int complexno2 = s3.nextInt();

            complexnumber c = new complexnumber();
            c.sum(realNo1, realNo2, complexno1, complexno2);
            c.sub(realNo1,realNo2,complexno1,complexno2);
c.multiply(realNo1,realNo2,complexno1,complexno2);
            System.out.println("Do you want run again then press y and if no press n");
            Scanner y = new Scanner(System.in);
            string = y.next();
            if (string.equals("n")|| string.equals("N"))
                break;
        }
        while (string.equals("y")|| string.equals("Y"));

    }
}