package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(calcEvenDigitSum(-22));
    }

    public static int calcEvenDigitSum(int num) {

        int digit;
        int actNum = num;
        int sum = 0;

        if(num > 0) {
            while (actNum > 0) {
                digit = actNum % 10;
                actNum = (actNum - digit) / 10;

                if (digit % 2 == 0) {
                    sum += digit;
                }
            }
            return sum;
        }
        return -1;
    }
}
