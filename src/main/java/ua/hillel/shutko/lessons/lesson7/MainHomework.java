package ua.hillel.shutko.lessons.lesson7;

import java.util.Arrays;

public class MainHomework {
    public static void main(String[] args) {
        int min = 18;
        int max = 40;
        final int COUNT_PLAYERS = 25;
        int[] team1 = new int[COUNT_PLAYERS];
        int[] team2 = new int[COUNT_PLAYERS];
        double sumYearsTeam1 = 0;
        double sumYearsTeam2 = 0;
        double avgYearsTeam1 = 0;
        double avgYearsTeam2 = 0;

        for (int i = 0; i < COUNT_PLAYERS; i++) {
            team1[i] = getRandomNumber(min, max);
            sumYearsTeam1 += team1[i];
            team2[i] = getRandomNumber(min, max);
            sumYearsTeam2 += team2[i];
        }

        avgYearsTeam1 = sumYearsTeam1 / COUNT_PLAYERS;
        avgYearsTeam2 = sumYearsTeam2 / COUNT_PLAYERS;

        System.out.println("team1: " + Arrays.toString(team1));
        System.out.println("team2: " + Arrays.toString(team2));
        System.out.println("avg team1: " + avgYearsTeam1);
        System.out.println("avg team2: " + avgYearsTeam2);
    }

    static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
