package com.service;

import com.test.person.Person;

import javax.swing.text.html.ImageView;
import java.util.HashMap;

public class PersonService {

    public static void main(String args[]){

        /*
        Person p1 = new Person("baobao",18);

//        System.out.println(p1.hashCode());

        boolean b1 = p1.equals(new Person("baobao",18));
        System.out.println(b1);

        HashMap<Person,Integer> m = new HashMap<Person,Integer>();
        m.put(p1,10);
        System.out.println(m.get(p1));

        System.out.println(m.get(new Person("baobao",18)));
        */
        System.out.println(2-1.1);

        //Character   some function like :isJavaIdentifierStart  to identify whether the character belong to UNICODE

        int x = 1;
        x+=3.5;
        System.out.println(x);

        int m = 7;
        int n = 7;
        int a = 2* ++m;
        int b = 2* n++;

        System.out.println("m:"+m+"\n a:"+a+"\n n"+n+"\n b:"+b);


        String greeting = "Hello";
        if(greeting == "Hello"){
            System.out.println("greeting == Hello");
        }
        System.out.println(greeting.substring(0,3) );
        if(greeting.substring(0,3) == "Hel"){
            System.out.println("greeting.substring(0,3) == Hello ");
        }

        int cpCount = greeting.codePointCount(0,greeting.length());
        System.out.println(cpCount);

        char ch = greeting.charAt(2);
        System.out.println(ch);

        int index = greeting.offsetByCodePoints(0,2);
        int cp = greeting.codePointAt(index);
        System.out.println("index:"+index+"\n cp:"+cp);




    }
}
