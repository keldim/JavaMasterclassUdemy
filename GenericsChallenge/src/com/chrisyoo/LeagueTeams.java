package com.chrisyoo;

import java.util.ArrayList;
import java.util.Collections;

public class LeagueTeams <T extends Team> {

    private String name;
    private ArrayList<T> teams = new ArrayList<T>();

    public LeagueTeams(String name) {
        this.name = name;
    }

    public boolean addTeam (T team) {
        if (teams.contains(team)) {
            System.out.println(team.getName() + " is already on this league");
            return false;
        } else {
            teams.add(team);
            System.out.println(team.getName() + " is successfully added");
            return true;
        }
    }


    public void printTeams () {
        Collections.sort(teams, new SortByRanking());
        for (int i = 0; i < teams.size(); i++) {
            System.out.println(teams.get(i).getName());
        }
    }




}
