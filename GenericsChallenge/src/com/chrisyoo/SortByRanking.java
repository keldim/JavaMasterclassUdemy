package com.chrisyoo;

import java.util.Comparator;

public class SortByRanking implements Comparator<Team> {


    public int compare(Team team1, Team team2) {
        if (team1.ranking() > team2.ranking()) {
            return -1;
        } else if (team1.ranking() < team2.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }


}
