package com.test.basic;

import java.io.Console;
import java.util.Scanner;

public class InputTest {


    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("What's your name");

        String name = in.nextLine();

        System.out.println("How old are you");
        int age = in.nextInt();

        System.out.println("Hello "+name+".Next year, you will be "+(age+1));

        System.out.printf("%o",159);

        String message = String.format("Hello, %s. Next year, you'll be %d",name,age);
        System.out.println(message);
    }
}
