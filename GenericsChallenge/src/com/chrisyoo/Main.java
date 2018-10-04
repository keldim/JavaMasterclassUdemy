package com.chrisyoo;

public class Main {

    public static void main(String[] args) {
        // Create a generic class to implement a league table for a sport.
        // The class should allow teams to be added to the list, and store
        // a list of teams that belong to the league.
        //
        // Your class should have a method to print out the teams in order,
        // with the team at the top of the league printed first.
        //
        // Only teams of the same type should be added to any particular
        // instance of the league class - the program should fail to compile
        // if an attempt is made to add an incompatible team.

        BasketballTeam one = new BasketballTeam("Bulls");
        BasketballTeam two = new BasketballTeam("Clippers");
        BasketballTeam three = new BasketballTeam("Warriors");
        BasketballTeam four = new BasketballTeam("Mavericks");
        BasketballTeam five = new BasketballTeam("Spurs");

        SoccerTeam six = new SoccerTeam("Galaxy");

        one.matchResult(two, 60, 40);
        one.matchResult(three, 70, 40);
        one.matchResult(four, 20, 40);
        one.matchResult(five, 55, 40);
        one.matchResult(two, 15, 40);
        one.matchResult(three, 20, 40);
        one.matchResult(four, 30, 30);
        one.matchResult(five, 60, 40);

        LeagueTeams<BasketballTeam> summerSeason = new LeagueTeams<BasketballTeam>("Summer Challenge");

        summerSeason.addTeam(one);
        summerSeason.addTeam(two);
        summerSeason.addTeam(three);
        summerSeason.addTeam(four);
        summerSeason.addTeam(five);


        System.out.println(one.getName() + " has a ranking of " + one.ranking());
        System.out.println(two.getName() + " has a ranking of " + two.ranking());
        System.out.println(three.getName() + " has a ranking of " + three.ranking());
        System.out.println(four.getName() + " has a ranking of " + four.ranking());
        System.out.println(five.getName() + " has a ranking of " + five.ranking());


        summerSeason.printTeams();
    }
}
