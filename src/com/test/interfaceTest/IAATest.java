package com.test.interfaceTest;


//@FunctionalInterface
public interface IAATest {

    String getName();

    boolean equals(Object obj);

    default int getAge(){return 0;}

    public static String setDefault(){

        return "default setting";
    }
}
