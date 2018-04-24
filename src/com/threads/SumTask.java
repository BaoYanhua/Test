package com.threads;

import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Long> {

    static final int THRESHOLD = 3;
    long[] arrays;
    int start;
    int end;

    SumTask(long[] arrays, int start, int end){
        this.arrays = arrays;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {

        if(end - start <= THRESHOLD){
            long sum = 0;
            for(int i = start; i< end; i++){
                sum += arrays[i];
            }

            return sum;
        }
        int middle = (start+end)/2;
        SumTask s1 = new SumTask(arrays,start,middle);
        SumTask s2 = new SumTask(arrays,middle,end);

        invokeAll(s1,s2);
//        s1.fork();
//        s2.fork();
        Long subresult1 = s1.join();
        Long subresult2 = s2.join();

        Long result = subresult1+subresult2;

        return result;
    }
}
