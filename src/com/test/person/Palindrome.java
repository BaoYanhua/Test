package com.test.person;


public class Palindrome {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int a = 0;

        try {

            String input = "abca";
            a = formPalindrome(input.toCharArray(), 0, input.length()- 1);

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(a);
    }

    public static int formPalindrome(char[] array, int str, int end) {

        int currentOperationTime;
        int leftOperationTimes;

        if (str > end || array == null){

            currentOperationTime = 0;
            leftOperationTimes = 0;

        }else if (array[str] == array[end]) {

            currentOperationTime = 0;
            leftOperationTimes = formPalindrome(array, str + 1, end - 1);

        }else{

            currentOperationTime = 1;
            leftOperationTimes = Math.min(formPalindrome(array, str + 1, end),formPalindrome(array, str, end - 1));

        }

        return currentOperationTime+leftOperationTimes;

    }

}