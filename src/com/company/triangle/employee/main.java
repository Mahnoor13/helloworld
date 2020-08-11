package com.company.triangle.employee;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Robert",1994,"64-C walls street");
        Employee employee2 = new Employee("SAM",2000,"68-D walls street");
        Employee employee3 = new Employee("john",1999,"26-B walls street");

        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(employee1);
        employeeArrayList.add(employee2);
        employeeArrayList.add(employee3);


        employee1.display(employeeArrayList);


    }
}


