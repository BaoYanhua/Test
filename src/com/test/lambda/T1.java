package com.test.lambda;

public class T1 {

    public static void main(String[] args) {
        repeatMessage("Hello", 20);
    }
    public static void repeatMessage(String text,int count){
        Runnable r = () -> {
            for(int i = 0; i < count; i++){
                System.out.println(text);
                Thread.yield();
            }
        };
        new Thread(r).start();

        int r1Count = 0;
        Runnable r1 = ()->{
            System.out.println(r1Count);
        };
        r1.run();
    }
}
