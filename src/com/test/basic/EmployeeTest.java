package com.test.basic;

import java.util.Arrays;

public class EmployeeTest {

    public static void main(String[] args){
        Employee[] staff = new Employee[3];

        staff[0] = new Employee(5000.0,"Tony");
        staff[1] = new Employee(6000.0,"Mike");
        staff[2] = new Employee(10000.0,"Tom");

        Arrays.sort(staff);

        for(Employee e:staff){
            System.out.println("name="+e.getName()+", salary="+e.getSalary());
        }
    }
}
