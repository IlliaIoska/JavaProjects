package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameStart = true;
        int score = 5;
        int bonus = 200;
        int levelCompleted = 8;

        int highScore = calculateScore(gameStart, score, levelCompleted, bonus);

        int playerPosition = calculateHighScorePosition(score);

        displayHighscorePosition("John", playerPosition);


    }

    public static int calculateScore(boolean gameStart, int score, int levelCompleted, int bonus) {
        if (gameStart) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore *=100;
            return finalScore;
        } else {
            return -1;
        }
    }

    public static void displayHighscorePosition(String name, int position) {
        System.out.println(name + " is placed as " + position);
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100); {
            position = 3;
        }
        return position;

    }
}
