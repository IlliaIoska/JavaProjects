package com.company;

public class Main {

    public static void main(String[] args) {

        int num = 4;
        int finishNum = 20;
        int count = 0;

        while(num <= finishNum && count <5) {
            num++;
            if(!isEvenNumber(num)) {
                continue;
            }
            count++;
            System.out.println("even number = " + num);
        }

        System.out.println("Total nums found = " + count);

    }

    public static boolean isEvenNumber(int num) {

        if(num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
