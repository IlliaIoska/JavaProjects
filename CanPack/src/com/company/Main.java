package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(canPack(0, 6, 5));
    }

    public static boolean canPack(int num1, int num2, int num3) {

        boolean canPack = false;
        if(num1 >= 0 && num2 >= 0 && num3 >= 0) {
            int goal = num3;
            int size1 = 5;
            int size2 = 1;
            int idealK1 = 0;
            int idealK2 = 0;

            while(goal > 0) {
                if(goal % size1 == 0) {
                    idealK1 = goal / size1;
                    break;
                } else {
                    goal--;
                    idealK2 = idealK2 + 1;
                }
            }

            if((num3 <= num1 * size1 + num2 * size2) && (num1 <= idealK1)) {
                canPack = true;
                return canPack;
            } else {
                return canPack;
            }

        } else {
            return canPack;
        }
    }
}
