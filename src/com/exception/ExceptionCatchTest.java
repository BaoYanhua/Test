package com.exception;

public class ExceptionCatchTest {

    public static void main(String[] args){

        try{
            NullPointerException e = new NullPointerException();
            throw e;
        }catch(NullPointerException e){
            System.out.println("nullPointerExceptoin");
        }catch (RuntimeException e){
            System.out.println("Exception ");
        }
    }
}
