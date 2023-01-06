public class Main {

    public static void main(String[] args) {

        String name = "john";
        int player_score = 1000;
        int position = calculate_high_score(player_score);
        display_high_score_position(name, position);
    }

    public static void display_high_score_position(String name, int position) {
        System.out.println("Player " + name + " got into position " + position);

    }

    public static int calculate_high_score(int player_score) {

        if (player_score > 1000) {
            return 1;
        } else if (player_score > 500) {
            return 2;
        } else if (player_score > 100) {
            return 3;
        } else {
            return 4;
        }
    }
}