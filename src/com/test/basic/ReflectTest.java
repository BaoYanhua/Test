package com.test.basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;

public class ReflectTest {

    public static void main(String[] args){
        try {
            Class c1 = Class.forName("java.lang.Double");
            Class superC1 = c1.getSuperclass();
            String modifiers = Modifier.toString(c1.getModifiers());

            System.out.println(modifiers +" "+c1.getName()+" extends "+superC1.getName());

            Constructor[] constructors = c1.getDeclaredConstructors();
            System.out.println(Arrays.deepToString(constructors));

            Method[] methods = c1.getMethods();
            System.out.println(Arrays.deepToString(methods));

        }catch(ClassNotFoundException  e){
            e.printStackTrace();

        }
    }
}
