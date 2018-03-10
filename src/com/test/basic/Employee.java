package com.test.basic;

public class Employee implements Comparable<Employee>{
    private Double salary;
    private String name;

    @Override
    public int compareTo(Employee o) {
        return Double.compare(o.salary,salary);
    }

    public Employee(Double salary, String name){
        this.salary = salary;
        this.name = name;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {

        return salary;
    }

    public String getName() {
        return name;
    }


}
