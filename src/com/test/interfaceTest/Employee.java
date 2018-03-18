package com.test.interfaceTest;

import java.util.Date;

public class Employee implements Cloneable{

    private Double salary;
    private String name;
    private Date hierDay;

    public Employee clone() throws CloneNotSupportedException{
        //no deep clone
//        return (Employee) super.clone();

        //call Object.cloned()
        Employee cloned = (Employee) super.clone();

        //clone mutalbe fields
        cloned.hierDay = (Date) hierDay.clone();

        return cloned;

    }
}
