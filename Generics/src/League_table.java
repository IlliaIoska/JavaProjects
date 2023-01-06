import java.util.ArrayList;
import java.util.Collections;

public class League_table<T extends Team> {
    public String league_name;
    ArrayList<T> teams_in_league;

    public League_table(String league_name) {
        this.league_name = league_name;
        this.teams_in_league = new ArrayList<>();
    }

    public void add_to_league(T team) {
        if(this.teams_in_league.contains(team)) {
            System.out.println("The team already exists in the league table");
        } else {
            teams_in_league.add(team);
            System.out.println("The team " + team.getTeam_name() + " has been added to the league table");
        }
    }

    public void sort_league_table() {
        Collections.sort(this.teams_in_league);
        for(T team : teams_in_league) {
            System.out.println("The team " + team.getTeam_name() + " is ranked " + team.get_rank());
        }
    }
}
