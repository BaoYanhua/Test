package com.test.innerClass;

/**
 * This program demonstrates the use of static inner classes
 * 对于一些不需要和外部类做参数交互的类即可以定义成静态内部类。
 * 静态内部类同样要满足静态代码块的所有要求， 如变量/方法都必须定义成静态的， 对象不需要像实例那样初始化，直接调用就可以了
 * @version 3.12 2018
 */
public class InnerClassTest4Static {

    public static void main(String[] args){
        double[] d = new double[20];
        for(int i=0;i<d.length;i++){
            d[i] = 100 * Math.random();
        }
        ArrayAlg.Pair p = ArrayAlg.minmax(d);
        System.out.println("min = "+p.getFirst());
        System.out.println("max = "+p.getSecond());
    }

}

class ArrayAlg{
    /**
     * A pair of floating-point numbers
     *
     */
    public static class Pair{
        private double first;
        private double second;

        /**
         * Constructs a pair from two floating-point numbers
         *@param f the first number
         *@param s the second number
         */
        public Pair(double f,double s){
            first = f;
            second = s;
        }

        /**
         * Returns the first number of the pair
         * @return
         */
        public double getFirst(){
            return first;
        }

        /**
         * Returns the second number of the pair
         * @return
         */
        public double getSecond(){
            return second;
        }
    }


    public static Pair minmax(double[] values){
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;

        for(double v: values){
            if(min>v) min = v;
            if(max<v) max = v;
        }
        return new Pair(min,max);
    }

}



