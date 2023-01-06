package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        boolean isNum;


            int max = 0;
            int min = 0;
            int num = 0;
            int i = 1;

            while(true) {
                isNum = scanner.hasNextInt();
                if(isNum) {
                    num = scanner.nextInt();
                    System.out.println("number #" + i + " = " + num);
                    if(i == 1) {
                        max = num;
                        min = num;
                    } else {
                        if(num >= max) {
                            max = num;
                        } else if(num <= min) {
                            min = num;
                        }
                    }
                    i++;
                } else {
                    System.out.println("not a number");
                    System.out.println("Max = " + max);
                    System.out.println("Min = " + min);
                    break;
                }
            }
        }
    }

