package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        boolean isNum = scanner.hasNextInt();

        if(isNum) {

            int i = 1;
            int sum = 0;
            while(i <= 10) {
                int num = scanner.nextInt();
                System.out.println("Number #" + i + ": " + num);
                sum += num;
                i++;
            }
            scanner.close();
            System.out.println("THe sum = " + sum);


        } else {
            System.out.println("Not a number");
        }
    }
}
