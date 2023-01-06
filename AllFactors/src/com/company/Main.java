package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(isPerfect(-1));
    }

    public static boolean isPerfect(int num) {

        boolean isPerfect = false;
        int divSum = 0;
        if(num >= 1) {
            int actNum = num - 1;
            while(actNum >= 1) {
                if(num % actNum == 0) {
                    divSum += actNum;
                }
                actNum--;
            }
            if(divSum == num) {
                isPerfect = true;
                return isPerfect;
            }
        } else {
            System.out.println("Invlid Value");
        }
        return isPerfect;
    }
}
