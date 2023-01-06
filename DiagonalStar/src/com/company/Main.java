package com.company;

public class Main {

    public static void main(String[] args) {

        drawStar(5);
    }

    public static void drawStar(int size) {

        if(size >= 5) {
            for(int i = 0; i < size; i++) {
                for(int k = 0; k < size; k++) {
                    if((i == 0) || (i == size -1) || (k == 0) || (k == size - 1) || ((i + k) % 2 == 0)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        } else {
            System.out.println("Invalid Value");
        }

    }
}
