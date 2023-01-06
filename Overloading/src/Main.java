public class Main {

    public static void main(String[] args) {

//        int newScore = calculateScore("Jerome", 500);
//        System.out.println("new score = " + newScore);
//        calculateScore();
//        calculateScore(75);

        convertToCentimeter(0,5);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score;
    }

    public static int calculateScore(int score) {
        System.out.println("Other Player scored " + score + " points");
        return score;
    }

    public static void calculateScore() {
        System.out.println("Other Player scored 0 points");
    }

    public static double convertToCentimeter(double feet, double inches) {

        if (!(feet >= 0 && inches >= 0 && inches <= 12)) {
            return -1;
        }
        else {
            double centimeters = 2.54 * (12 * feet + inches);
            System.out.println(feet + " feet + " + inches + " inches = " + centimeters + " centimeters");
            return centimeters;
        }
    }

    public static double convertToCentimeter(double inches) {

        if (!(inches >= 0 && inches <= 12)) {
            return -1;
        }
        else {
            double feet = inches / 12;
            return feet;
        }
    }
}
