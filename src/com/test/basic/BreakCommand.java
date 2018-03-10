package com.test.basic;

import java.util.Scanner;

public class BreakCommand {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n>10){
            System.out.println("come into while");

            break_flag:
            for(int i=0;i<5;i++){
                System.out.println("come into for");
                int m = in.nextInt();
                if(m>10){
                    System.out.println("break out loop");
                    break break_flag;
                }

            }
        }

    }
}
