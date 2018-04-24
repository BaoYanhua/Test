package com.test;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Test {

    public static void main(String[] args){

        //值传递和引用传递
        int a = 5;
        int b = a;

        b = 6;

        System.out.println("b:"+b+", a:"+a);

        int[] aArr = {2,3,4};
        int[] bArr = aArr;

        System.out.println(Arrays.toString(aArr));
        bArr[0] = 1;

        System.out.println(Arrays.toString(aArr));



        //创建字符串"Hello World"， 并赋给引用s
        String s = "Hello World";
        System.out.println("s = " + s); //Hello World

        try{
            //获取String类中的value字段
            Field valueFieldOfString = String.class.getDeclaredField("value");
            //改变value属性的访问权限
            valueFieldOfString.setAccessible(true);

            //获取s对象上的value属性的值
            char[] value = (char[]) valueFieldOfString.get(s);
            //改变value所引用的数组中的第5个字符
            value[5] = '_';
            System.out.println("s = " + s);  //Hello_World
        }catch(NoSuchFieldException e){
            e.printStackTrace();
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }


    }
}
