package com.test.basic;

public class Child extends Parent{

    private int age;
    private String name;
    static{
        System.out.println("Child static block");
    }

    {
        System.out.println("Child Bolck");
    }

    public Child(){
        if(this.aa !=null){
            System.out.println("parent aa is not null");
        }
        System.out.println("Child constructor");
    }

    public Child(int pAge,String pName){

        super(pAge,pName);
        System.out.println("Child constructor with parameter");
        this.age = pAge;
        this.name = pName;
    }

    @Override
    public void targetMethod(int age,String name){
        System.out.println("Child method: age"+age+",name:"+name);

    }

    public static void main(String[] args){
        int age = 40;
        String name = "pp Mom";
        System.out.println("*****************************");

        Parent p1 = new Parent(age,name);
        p1.targetMethod(age,name);
        System.out.println("*****************************");
        Child c1 = new Child(age,name);
//        Child c2 = new Child();
        c1.targetMethod(age,name);

        System.out.println(p1.getClass());
        System.out.println(c1.getClass());

        System.out.println(c1 instanceof Parent);
        System.out.println(p1 instanceof Child);
    }


}
