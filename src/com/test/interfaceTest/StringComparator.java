package com.test.interfaceTest;

import java.util.Arrays;
import java.util.Comparator;

public class StringComparator {

    public static void main(String[] args){
        String[] words = new String[3];
        words[0] = "Tony";
        words[1] = "Amenda";
        words[2] = "Ada";
        Comparator<String> comp = new LengthComparator();

        Arrays.sort(words,comp);

        System.out.println(Arrays.toString(words));
    }
}
