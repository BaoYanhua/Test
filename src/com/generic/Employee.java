package com.generic;

public class Employee implements Runnable{

    private String name;
    private Integer age;

    public Employee(){

    }

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public void run() {
        System.out.println("Employee run()");
    }
}
