package com.generic;

public class Manager extends Employee implements Runnable{

    private String name;
    private Integer age;
    private Double salary;
    private Double bonus;


    public Manager(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Manager(String name, Double salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }
}
