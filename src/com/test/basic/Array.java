package com.test.basic;

import java.util.Arrays;

public class Array {

    final static int NMAX = 10;

    public static void main(String[] args){

        int[] a = new int[5];
        for(int i=0;i<a.length;i++){
            a[i] = i;
        }

        int[] b = a;

        int[] c = Arrays.copyOf(a,a.length);

        a[3] = 100;
        System.out.println("a:"+a[3]);
        System.out.println("b:"+b[3]);
        System.out.println("c:"+c[3]);

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        Arrays.binarySearch(a,100);

        mutipleArray();
    }

    public static void mutipleArray(){
        int[][] odds = new int[NMAX+1][];
        for(int n=0;n<= NMAX;n++){
            odds[n] = new int[n+1];
        }
        for(int n=0;n<odds.length;n++){
            for(int k=0;k<odds[n].length;k++){
                int lotteryOdds = 1;
                for(int i=1;i<=k;i++){
                    lotteryOdds = lotteryOdds*(n-i+1)/i;
                }
                odds[n][k] = lotteryOdds;
            }
        }
        System.out.println(Arrays.deepToString(odds));
    }
}
