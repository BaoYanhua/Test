package com.generic;

public class PairTest2 {

    public static void main(String[] args){
        Employee e = new Employee("coco",10);
        Employee pe = Test.getInfo(e);




    }
}


class Test{

    public static <T extends Runnable> T getInfo(T a){

        System.out.println("come into getInfo");
        a.run();
        return a;
    }
}
