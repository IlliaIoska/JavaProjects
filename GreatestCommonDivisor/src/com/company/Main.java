package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(12, 14));
    }

    public static int getGreatestCommonDivisor(int num1, int num2) {

        if((num1 >= 10) && (num2 >= 10)) {
            int actNum1;
            int actNum2;
            int commonDiv = 0;

            if(num1 == num2) {
                commonDiv = num1;
                return commonDiv;
            }

            if(num1 < num2) {
                actNum1 = num1;
                if(num2 % actNum1 == 0) {
                    commonDiv = num1;
                    return commonDiv;
                }

                while(actNum1 >= 1) {
                    if((num1 % actNum1 == 0) && (num2 % actNum1 == 0)) {
                        commonDiv = actNum1;
                        return commonDiv;
                    }
                    actNum1--;
                }
            }
        }
       return -1;
    }
}
