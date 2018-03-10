package com.test.basic;

public class UnknownNumbersParam {

    public static void main(String[] args){
        double max = max(2,3,4,5,6,-1,-0.009);
        System.out.println("Max Value:"+max);
    }

    public static double max(double... values){
        double largest = Double.NEGATIVE_INFINITY;
        for(double v:values){
            if(v>largest)
                largest = v;
        }
        return largest;
    }
}
