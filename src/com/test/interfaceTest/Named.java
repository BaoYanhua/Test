package com.test.interfaceTest;

public interface Named {
    default String getName(){
        return "Named default Method";
    }
}
