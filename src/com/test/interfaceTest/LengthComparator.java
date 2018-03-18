package com.test.interfaceTest;

import java.util.Comparator;

public class LengthComparator implements Comparator<String> {

    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }
}
