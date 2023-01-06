package com.company;

public class Main {

    public static void main(String[] args) {

        int sum = 0;
        int count = 0;
        for(int i = 1; i <= 1000; i++) {
            if(i % 15 == 0) {
                count ++;
                sum += i;
            }
            if(count == 5) {
                System.out.println(sum);
                break;
            }
        }
    }
}
