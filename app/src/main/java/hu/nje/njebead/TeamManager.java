package hu.nje.njebead;

import java.util.ArrayList;
import java.util.List;

import hu.nje.njebead.models.Team;

public class TeamManager {

    public static List<Team> getTeamList() {

        List<Team> teams = new ArrayList<>();

        teams.add(new Team(1,"Fradi"));
        teams.add(new Team(2,"MTK"));
        teams.add(new Team(3,"Dunafer"));
        teams.add(new Team(4,"Honvéd"));
        teams.add(new Team(5,"Szolnok"));

        return teams;
    }

}
