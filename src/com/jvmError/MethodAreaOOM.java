package com.jvmError;

import java.util.ArrayList;
import java.util.List;

public class MethodAreaOOM {

    static String test = "Test";
    public static void main(String[] args){
        System.out.println(test.intern());

//        List<String> list = new ArrayList<>();
//        for(int i=0;i<Integer.MAX_VALUE;i++){
//            test = test + i;
//            list.add(test.intern());
//        }


    }
}
