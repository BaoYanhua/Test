package com.test.interfaceTest;

public interface IPerson {

    default String getName(){
        return "IPerson default method";
    }

}
