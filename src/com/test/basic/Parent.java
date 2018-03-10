package com.test.basic;

public class Parent {

    private int age;
    private String name;

    public String aa;
    static{
        System.out.println("Parent static block");
    }

    {
        System.out.println("Parent bolck");
    }

    public Parent(){
        System.out.println("Parent constructor");
    }

    public Parent(int pAge,String pName){
        System.out.println("Parent constructor with parameter");
        this.age = pAge;
        this.name = pName;
    }

    public void targetMethod(int age,String name){
        System.out.println("Parent method: age"+age+",name:"+name);

    }
}
