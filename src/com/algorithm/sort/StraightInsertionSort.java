package com.algorithm.sort;

import java.util.Arrays;

public class StraightInsertionSort {

    public static void main(String[] args){

        int[] A = {49,38,76,12,53,0,22,17,89,5,100};


        for(int i = 1; i< A.length; i++){

            int temp = A[i];

            for(int j = i-1;j>=0;j--){
                if(temp < A[j]){
                    A[j+1] =  A[j];
                    A[j] = temp;

                    System.out.println(Arrays.toString(A));

                }else{
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(A));


    }
}
