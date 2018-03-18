package com.test.solution;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args){
        int[] A = {1,2,3,4,-1,5,6,3,2,7,8,9,10,11};
        int[] B = {30,20,10};
        int[] C = {2,2,2,2,1,2,-1,2,1,3};
        int result = solution(C);
        System.out.println("lalalalalal: "+result);

    }

    public static int solution2(int[] A) {
        int maxLen = 0, maxStart = 0;
        int len = 0, lastStart = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] < A[i]) {
                len++;
            } else {
                if (len > maxLen) {
                    maxStart = lastStart;
                    maxLen = len;
                }
                lastStart = i;
                len = 0;
            }
        }
        if (len > maxLen) {
            maxStart = lastStart;
        }
        return maxStart;
    }


    public static int solution(int[] A){

        int[] size = new int[A.length+1];
        int sizeIndex = 0;
        size[sizeIndex] = 0;
        for(int i = 1;i<A.length;i++){

            System.out.println(A[i]+","+A[i-1]);
            if(A[i]<=A[i-1]){
                System.out.println("******->"+i);
                sizeIndex++;
                size[sizeIndex] = i;

            }
        }
        sizeIndex++;
        size[sizeIndex] = A.length-1;
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(size));


        int result = 0;
        int maxSize = 0;
        for(int i=1;i<size.length;i++){
            if(size[i] != 0){
                if((size[i] - size[i-1]) > maxSize ){
                    maxSize = size[i] - size[i-1];
                    result = size[i-1];
                }
            }
        }

        System.out.println("maxSize: "+maxSize);
        System.out.println("result: "+result);

        return result;


    }

}
