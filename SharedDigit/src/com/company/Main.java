package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12, 11));
    }

    public static boolean hasSharedDigit(int num1, int num2) {

        boolean share = false;
        if((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99)) {
            int digit1;
            int digit2;
            int actNum1 = num1;
            int actNum2 = num2;


            while(actNum1 > 0) {
                digit1 = actNum1 % 10;
                actNum1 = (actNum1 - digit1) / 10;
                System.out.println(digit1);

                while(actNum2 > 0) {
                    digit2 = actNum2 % 10;
                    actNum2 = (actNum2 - digit2) / 10;
                    System.out.println(digit2);

                    if(digit1 == digit2) {
                        share = true;
                        return share;
                    }
                }
                actNum2 = num2;
            }
        }
        return share;
    }
}
