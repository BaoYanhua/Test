package com.algorithm.sort;

import java.util.Arrays;

public class SimpleSelectionSort {

    public static void main(String[] args){

        int[] A = {49,38,76,12,53,0,22,17,89,5,100};


        System.out.println(Arrays.toString(sort(A)));

    }

    public static int[] sort(int[] A){

        int minIndex = 0;

        int maxIndex = 0;

        System.out.println(Arrays.toString(A)+" "+minIndex+" "+maxIndex);

        for(int headIndex=0,tailIndex=A.length-1;headIndex<=tailIndex;headIndex++,tailIndex--){
            for(int i=headIndex;i<=tailIndex;i++){
                if(A[i]< A[minIndex]){
                    minIndex = i;
                }

                if(A[i]>A[maxIndex]){
                    maxIndex = i;
                }
            }

            int minTemp = A[minIndex];
            int maxTemp = A[maxIndex];

            A[minIndex]= A[headIndex];
            A[maxIndex]= A[tailIndex];

            A[headIndex] = minTemp;
            A[tailIndex] = maxTemp;

            System.out.println(Arrays.toString(A)+" "+minIndex+" "+maxIndex);


            minIndex = headIndex+1;
            maxIndex = headIndex+1;


        }

        return A;
    }

}
