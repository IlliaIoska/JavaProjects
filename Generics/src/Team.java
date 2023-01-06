import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String team_name;
    int games_played = 0;
    int games_won = 0;
    int games_lost = 0;
    int games_tied = 0;
    private ArrayList<T> players = new ArrayList<>();

    public Team(String team_name) {
        this.team_name = team_name;
    }

    public String getTeam_name() {
        return team_name;
    }

    public Player add_player(T new_player) {
        if (players.contains(new_player)) {
            System.out.println("The player " + new_player.getName() + " is already on the team");
            return null;
        } else {
            players.add(new_player);
            System.out.println("The player " + new_player.getName() + " has been added to the players on the team");
        }
        return ((Player) new_player);
    }

    public int get_team_size() {
        System.out.println("The team " + this.team_name + " has " + this.players.size() + " members");
        return this.players.size();
    }

    public void calc_result(Team<T> opponent_team, int opponent_score, int our_score) {
        if (opponent_score > our_score) {
            this.games_lost++;
            System.out.println(opponent_team.getTeam_name() + " wins");
        } else if (opponent_score < our_score) {
            this.games_won++;
            System.out.println(getTeam_name() + " wins");
        } else {
            this.games_tied++;
            System.out.println("Tied");
        }
        this.games_played++;

//        if (opponent_team != null) {
//            opponent_team.calc_result(null, our_score, opponent_score);
//        }
    }

    public int get_rank() {
        return (games_won * 2) + games_tied;
    }
    @Override
    public int compareTo(Team<T> team) {
        if (this.get_rank() > team.get_rank()) {
            return -1;
        } else if (this.get_rank() < team.get_rank()) {
            return 1;
        } else {
            return 0;
        }
    }
}
