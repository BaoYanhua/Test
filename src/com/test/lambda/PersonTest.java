package com.test.lambda;

import com.test.basic.Array;

import java.util.Arrays;
import java.util.Comparator;

public class PersonTest {

    public static void main(String[] args){

        Person[] pArray = new Person[3];
        pArray[0] = new Person("Tony",18);
        pArray[1] = new Person("Amenda",21);
        pArray[2] = new Person("wuliwala",30);

        //call Comparator static method to sort
        Arrays.sort(pArray, Comparator.comparing(Person::getName).thenComparing(Person::getAge));
        System.out.println(Arrays.toString(pArray));

        //call Comparator static method and override compare ways to implement sort
        Arrays.sort(pArray, Comparator.comparing(Person::getName,(s,t)->s.length()-t.length()).thenComparing(Person::getAge).reversed());
        System.out.println(Arrays.toString(pArray));

        //Comparator static method reverse can sort desc directlly
        Arrays.sort(pArray, Comparator.comparing(Person::getAge).reversed());
        System.out.println(Arrays.toString(pArray));

        //use lambda to implement Comparator -> compare method
        Arrays.sort(pArray, (s,t)->s.getName().length()-s.getName().length());
        System.out.println(Arrays.toString(pArray));

        //use lambda to implement Comparator -> compare method
        Arrays.sort(pArray, (s,t)->t.getAge()-s.getAge());
        System.out.println(Arrays.toString(pArray));

    }
}
