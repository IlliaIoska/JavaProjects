package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(22, 12, 12));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

        boolean same = false;
        if((num1 >= 10 && num1 <= 100) && (num2 >= 10 && num2 <= 100) && (num3 >= 10 && num3 <= 100)) {
            int digit1;
            int digit2;
            int digit3;
            int actNum1 = num1;
            int actNum2 = num2;
            int actNum3 = num3;


            while(actNum1 > 0 && actNum2 > 0 && actNum3 > 0) {
                digit1 = actNum1 % 10;
                actNum1 = (actNum1 - digit1) / 10;

                digit2 = actNum2 % 10;
                actNum2 = (actNum2 - digit2) / 10;

                digit3 = actNum3 % 10;
                actNum3 = (actNum3 - digit3) / 10;

                if((actNum1 / 10 == 0) && (actNum2 / 10 == 0) && (actNum3 / 10 == 0)) {
                    digit1 = actNum1;
                    digit2 = actNum2;
                    digit3 = actNum3;

                    if((digit1 == digit2) || (digit1 == digit3)) {
                        same = true;
                        return same;
                    }
                }




                actNum2 = num2;
            }
        }
        return same;
    }
}
