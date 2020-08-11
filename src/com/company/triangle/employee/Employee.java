package com.company.triangle.employee;

import java.util.ArrayList;

public class Employee {
private String name;
private int Yearofjoin;
private String addrrss;

Employee(String Name, int yearofjoin, String Address){
    this.name = Name;
    this.Yearofjoin = yearofjoin;
    this.addrrss = Address;
}


    public String getName() {
        return name;
    }

    public int getYearOfJoin() {
        return Yearofjoin;
    }

    public String getAddress() {
        return addrrss;
    }

    public void display(ArrayList<Employee> arrayList)
    {
    System.out.println("Name"+"     "+"Year Of Joining"+"     "+"Address");

    for(int i =0 ; i<arrayList.size(); i++){
        System.out.print(arrayList.get(i).getName()+"     "+arrayList.get(i).getYearOfJoin()+"     "+arrayList.get(i).getAddress());
        System.out.println();
    }

    }

}
