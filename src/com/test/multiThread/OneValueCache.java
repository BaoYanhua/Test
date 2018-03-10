package com.test.multiThread;

import java.math.BigInteger;
import java.util.Arrays;

public class OneValueCache {

    private final BigInteger lastNumber;
    private final BigInteger[] lastFactors;

    public OneValueCache(BigInteger i,BigInteger[] factors){
        lastNumber = i;
        lastFactors = Arrays.copyOf(factors,factors.length);
    }

    public BigInteger[] getLastFactors() {
        if(lastNumber == null ){
            return null;
        }else{
            return Arrays.copyOf(lastFactors,lastFactors.length);
        }


    }
}
