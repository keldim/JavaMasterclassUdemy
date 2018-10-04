package com.chrisyoo;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        System.out.println(calcFeetAndInchesToCentimeters(68));
    }

    public static int calculateScore (String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore (int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore () {
        System.out.println("No player name, no player score.");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
        if (feet < 0 || inches > 12 || inches < 0) {
            return -1;
        }
        return (12 * feet * 2.54) + (inches * 2.54);
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {
        if (inches < 0) {
            return -1;
        }
        double newfeet = (int) (inches / 12);
        double newInches = (int) (inches % 12);

        return calcFeetAndInchesToCentimeters(newfeet, newInches);

    }
}
