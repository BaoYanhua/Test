package com.test.multiThread;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FinalVariableEdit {

    public static final int vFinal = 0;

    public static List<String> vFinalList = new ArrayList<>();

    public static void main(String[] args){

//        cannot assign a value to final variable
//        vFinal = 10;

        System.out.println(vFinal);
        System.out.println("vFinalList:"+vFinalList+"\n vFinalList Length: "+vFinalList.size());
        vFinalList.add("update value");
        vFinalList.add("update again");
        System.out.println("vFinalList:"+vFinalList+"\n vFinalList Length: "+vFinalList.size());

        Map map = new HashMap();

    }


}
