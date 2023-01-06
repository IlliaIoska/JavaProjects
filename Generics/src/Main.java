public class Main {
    public static void main(String[] args) {
        Baseball_player johny = new Baseball_player("Johny");
        Football_player batty = new Football_player("Batty");
        Football_player ganny = new Football_player("Ganny");
        Team<Baseball_player> baseball_team = new Team<>("Johny's baseball team");
        baseball_team.add_player(johny);

        Team<Football_player> football_team_1 = new Team<>("Batty's football team");
        football_team_1.add_player(batty);

        Team<Football_player> football_team_2 = new Team<>("Ganny's football team");
        football_team_2.add_player(ganny);

        League_table<Team<Football_player>> league_table = new League_table<>("Football league");
        league_table.add_to_league(football_team_1);
        league_table.add_to_league(football_team_2);
        league_table.sort_league_table();
    }
}