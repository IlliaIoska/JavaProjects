package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }

    public static boolean isOdd(int num) {

        if((num - 1) % 2 == 0) {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        int oddSum = 0;
        if ((end >= start) && (start > 0 && end > 0)) {
            for (int i = start; i <= end; i++) {
              if(isOdd(i)) {
                  oddSum += i;
              }
            }
            return oddSum;
        }
        return -1;
    }
}
