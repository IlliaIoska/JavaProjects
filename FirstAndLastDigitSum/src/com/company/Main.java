package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(-1234));
    }

    public static int sumFirstAndLastDigit(int num) {

        int first = num % 10;
        int last;
        int digit;
        int actNum = num;

        if(actNum >= 10 ) {
            while (true) {
                digit = actNum % 10;
                actNum = (actNum - digit) / 10;

                if (actNum < 10) {
                    last = actNum;
                    return first + last;
                }
            }
        } else if(actNum <= -10) {
            while (true) {
                digit = actNum % 10;
                actNum = (actNum - digit) / 10;

                if (actNum > -10) {
                    last = actNum;
                    return first + last;
                }
            }
        }
        return -1;
    }
}
