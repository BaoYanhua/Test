package com.threads;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class ForkJoinTest {


    public static void main(String[] args){


        long[] arrays = {1l,2l,3l,4l,5l,6l,7l};

        ForkJoinPool fjp = new ForkJoinPool(4);
        ForkJoinTask<Long> task = new SumTask(arrays,0,arrays.length);

        Long result = fjp.invoke(task);
        System.out.println(result);


    }


}
