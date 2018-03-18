package com.exception;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * A program that displays a trace feature of a recursive method call
 * @version 3.13 2018
 */
public class StackTraceTest {

    /**
     * Computes the factorial of a number
     * @param n a non-negative integer
     *
     */
    public static int factorical(int n){
        Logger.getGlobal().info("Action->Execute multiplier ");

        System.out.println("factorial("+n+"):");
        Throwable t = new Throwable();
        StackTraceElement[] frames = t.getStackTrace();
        for(StackTraceElement f:frames){
            System.out.println(f);
        }
        int r;
        if(n<=1)
            r=1;
        else
            r=n*factorical((n-1));
        System.out.println("return "+r);
        return r;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: " );
        int n = in.nextInt();
        factorical(n);
    }
}
