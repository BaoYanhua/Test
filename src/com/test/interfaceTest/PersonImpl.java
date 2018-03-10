package com.test.interfaceTest;

public class PersonImpl extends Person implements IPerson,Named{



    public static void main(String[] args){
        IPerson p1 = new PersonImpl();
        System.out.println(p1.getName());
    }

//    @Override
//    public String getName(){
//        return IPerson.super.getName();
//    }

}
