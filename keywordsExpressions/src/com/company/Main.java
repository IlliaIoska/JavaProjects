package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameStart = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        if(gameStart) {
            int finalScore = score + bonus;
            System.out.println("Final score = " + finalScore);
        }

        if(gameStart) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("final score = " + finalScore);
        }

    }
}
