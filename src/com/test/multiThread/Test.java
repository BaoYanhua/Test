package com.test.multiThread;

/**
 * volatile automic
 */
public class Test {

    public volatile int inc = 0;

    public void increase(){
        inc++;
    }

    public static void main(String[] args){
        System.out.println("start...");

        final Test v = new Test();
        for(int i=0;i<10;i++){
//            new Thread(){
//                public void run(){
//                    for(int j=0;j<1000;j++){
//                        v.increase();
//                    }
//                }
//            }.start();


            new Thread(()->{
                for(int k=0;k<1000;k++){
                    v.increase();
                }
            }).start();

        }

        while(Thread.activeCount()<1){
            Thread.yield();
        }
        System.out.println("final number:"+ v.inc);
    }
}
