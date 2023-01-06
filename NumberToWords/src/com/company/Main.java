package com.company;

public class Main {

    public static void main(String[] args) {

        numberToWords(1345);
        System.out.println(reverse(124));
    }

    public static void numberToWords(int num) {

        if(num < 0) {
            System.out.println("Negative Value");
        } else {
            int actNum = reverse(num);
            while(actNum > 0) {
                int lastDigit = actNum % 10;
                actNum = (actNum - lastDigit) / 10;
                switch(lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;

                    case 1:
                        System.out.println("One");
                        break;

                    case 2:
                        System.out.println("Two");
                        break;

                    case 3:
                        System.out.println("Three");
                        break;

                    case 4:
                        System.out.println("Four");
                        break;

                    case 5:
                        System.out.println("Five");
                        break;

                    case 6:
                        System.out.println("Six");
                        break;

                    case 7:
                        System.out.println("Seven");
                        break;

                    case 8:
                        System.out.println("Eight");
                        break;

                    case 9:
                        System.out.println("Nine");
                        break;
            }
            }
        }
    }

    public static int reverse(int num) {

        if(num > 0) {
            int actNum = num;
            int laseDigit;
            int reversedNum = 0;

            while(actNum > 0) {
                laseDigit = actNum % 10;
                 reversedNum += laseDigit;
                 actNum = (actNum - laseDigit) / 10;
                if(actNum == 0) {
                    break;
                }
                 reversedNum *= 10;

            }
            return reversedNum;
        } else {
            return -1;
        }
    }
}
