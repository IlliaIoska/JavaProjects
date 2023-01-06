package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        inputThenPrintSumAndAvg();
    }

    public static void inputThenPrintSumAndAvg() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        boolean isInt;
        double num;
        double sum = 0;
        double avg = 0;
        int counter = 0;

        while(true) {
            isInt = scanner.hasNextInt();
            if(isInt) {
                counter ++;
                num = scanner.nextInt();
                System.out.println("#1: " + num);
                sum += num;
                avg = (double) (sum / counter);
            } else {
                System.out.println("Not a number");
                System.out.println("sum = " + sum);
                System.out.println("avg = " + avg);
                break;
            }
        }
    }
}
