package ua.hillel.shutko.homework.homework5;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the name of the first team");
        String teamName1 = scanner.nextLine();
        System.out.println("The name of the first team: " + teamName1);

        System.out.println("Please enter the number of frags of the first player");
        int player1Team1 = 0;
        if (scanner.hasNextInt()) {
            player1Team1 = scanner.nextInt();
            System.out.println("The number of frags of the first player = " + player1Team1);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        System.out.println("Please enter the number of frags of the second player");
        int player2Team1 = 0;
        if (scanner.hasNextInt()) {
            player2Team1 = scanner.nextInt();
            System.out.println("The number of frags of the second player = " + player2Team1);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        System.out.println("Please enter the number of frags of the third player");
        int player3Team1 = 0;
        if (scanner.hasNextInt()) {
            player3Team1 = scanner.nextInt();
            System.out.println("The number of frags of the third player = " + player3Team1);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        System.out.println("Please enter the number of frags of the fourth player");
        int player4Team1 = 0;
        if (scanner.hasNextInt()) {
            player4Team1 = scanner.nextInt();
            System.out.println("The number of frags of the fourth player = " + player4Team1);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        System.out.println("Please enter the number of frags of the fifth player");
        int player5Team1 = 0;
        if (scanner.hasNextInt()) {
            player5Team1 = scanner.nextInt();
            System.out.println("The number of frags of the fifth player = " + player5Team1);
            scanner.nextLine();
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        System.out.println("Please enter the name of the second team");
        String teamName2 = scanner.nextLine();
        System.out.println("The name of the second team: " + teamName2);

        System.out.println("Please enter the number of frags of the first player");
        int player1Team2 = 0;
        if (scanner.hasNextInt()) {
            player1Team2 = scanner.nextInt();
            System.out.println("The number of frags of the first player = " + player1Team2);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        System.out.println("Please enter the number of frags of the second player");
        int player2Team2 = 0;
        if (scanner.hasNextInt()) {
            player2Team2 = scanner.nextInt();
            System.out.println("The number of frags of the second player = " + player2Team2);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        System.out.println("Please enter the number of frags of the third player");
        int player3Team2 = 0;
        if (scanner.hasNextInt()) {
            player3Team2 = scanner.nextInt();
            System.out.println("The number of frags of the third player = " + player3Team2);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        System.out.println("Please enter the number of frags of the fourth player");
        int player4Team2 = 0;
        if (scanner.hasNextInt()) {
            player4Team2 = scanner.nextInt();
            System.out.println("The number of frags of the fourth player = " + player4Team2);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        System.out.println("Please enter the number of frags of the fifth player");
        int player5Team2 = 0;
        if (scanner.hasNextInt()) {
            player5Team2 = scanner.nextInt();
            System.out.println("The number of frags of the fifth player = " + player5Team2);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        int sumTeam1 = (player1Team1 + player2Team1 + player3Team1 + player4Team1 + player5Team1);
        int arithmeticAverageTeam1 = (sumTeam1 / 5);
        System.out.println("Arithmetic average of the " + teamName1 + " team = " + arithmeticAverageTeam1);

        int sumTeam2 = (player1Team2 + player2Team2 + player3Team2 + player4Team2 + player5Team2);
        int arithmeticAverageTeam2 = (sumTeam2 / 5);
        System.out.println("Arithmetic average of the " + teamName2 + " team = " + arithmeticAverageTeam2);

        if (arithmeticAverageTeam1 > arithmeticAverageTeam2) {
            System.out.println("The winning team " + teamName1 + " scored " + arithmeticAverageTeam1 + " points");
        } else if (arithmeticAverageTeam1 < arithmeticAverageTeam2) {
            System.out.println("The winning team " + teamName2 + " scored " + arithmeticAverageTeam2 + " points");
        } else {
            System.out.println("No one won. Draw!");
        }
    }
}

