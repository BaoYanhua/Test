package com.generic;

import java.util.Comparator;

/**
 * @version 3.13 2018
 */
public class PairTest {

    public static void main(String[] args){

        String[] words = {"Mary","had","a","little","lamb"};
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = "+mm.getFirst());
        System.out.println("max = "+mm.getSecond());

        Double[] nums = {2.2,3.3,4.1,5.6,7.0,11.1,5.0,1.2,0.2};
        Double dd = ArrayAlg.min(nums);
        System.out.println(dd);

//        Pair<String> p = Pair.makePair(String::new);
//        p = ArrayAlg.min(words);
    }
}

class ArrayAlg{

    public static Pair<String> minmax(String[] a){
        if(a == null || a.length == 0)
            return null;
        String min = a[0];
        String max = a[0];
        for(int i = 1;i<a.length;i++){
            if(min.compareToIgnoreCase(a[i]) > 0) min = a[i];
            if(max.compareToIgnoreCase(a[i]) < 0 ) max = a[i];
        }
        return new Pair<>(min,max);
    }

    public static <T extends Comparable>  T min(T[] a){
        if(a == null || a.length == 0)
            return null;
        T min = a[0];
        for(int i = 1;i<a.length;i++){
            if(min.compareTo(a[i]) > 0) min = a[i];
        }
        return min;
    }
}
