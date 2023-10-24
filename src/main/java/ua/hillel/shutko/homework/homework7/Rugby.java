package ua.hillel.shutko.homework.homework7;

import java.util.Arrays;

public class Rugby {
    public static void main(String[] args) {

        int minAgePlayer = 18;
        int maxAgePlayer = 40;

        int[] team1 = new int[25];
        for (int i = 0; i < team1.length; i++) {
            team1[i] = (int) (Math.random() * (maxAgePlayer - minAgePlayer + 1) + minAgePlayer);
        }
        System.out.println(Arrays.toString(team1));

        int[] team2 = new int[25];
        for (int i = 0; i < team2.length; i++) {
            team2[i] = (int) (Math.random() * (maxAgePlayer - minAgePlayer + 1) + minAgePlayer);
        }
        System.out.println(Arrays.toString(team2));

        int agePlayersTeam1 = 0;
        for (int value : team1) {
            agePlayersTeam1 += value;
        }
        double averageAgeTeam1 = (double) agePlayersTeam1 / team1.length;

        int agePlayersTeam2 = 0;
        for (int value : team2) {
            agePlayersTeam2 += value;
        }
        double averageAgeTeam2 = (double) agePlayersTeam2 / team2.length;

        System.out.println("Average age of players of 1 team = " + averageAgeTeam1);
        System.out.println("Average age of players of 2 team = " + averageAgeTeam2);
    }
}
