package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumDigits(1111));
    }

    public static int sumDigits(int num) {

        if (num >= 10) {
            int sum = 0;
            int i = 1;
            int digit = num % 10;
            int updatedNum = num;

            while(updatedNum > 0) {
                sum += digit;
                updatedNum = (updatedNum - digit) / 10;
                i++;
                digit = updatedNum % 10;
            }
            return sum;
        }
        return -1;
    }
}
