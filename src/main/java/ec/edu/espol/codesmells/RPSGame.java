/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espol.codesmells;

/**
 *
 * @author aleja
 */
public class RPSGame {
    public static void main(String args[]) {
        Player p1 = new Player();
        Player p2 = new Player();
        boolean gameWon = false;
        int roundsPlayed = 0;   // Number of rounds played
        int p1Wins = p1.wins;
        int p2Wins = p2.wins;
        int draw = 0;
        String p1choice;
        String p2choice;

        // Game loop
        do {
            System.out.println("****** Round: " + roundsPlayed + " ***************\n");
            System.out.println("Number of Draws: " + draw + "\n");
            p1choice = p1.playerChoice();
            System.out.println("Player 1 Total Wins: " + p1Wins);
            p2choice = p2.playerChoice();
            System.out.println("Player 2 Total Wins: " + p2Wins);
            System.out.println("Player 1 chose " + p1choice + " and Player 2 chose " + p2choice + "\n");

            if ((p1choice.equals("rock")) && (p2choice.equals("paper"))) {
                System.out.println("Player 2 wins");
                p2Wins++;
            } else if ((p1choice.equals("paper")) && (p2choice.equals("rock"))) {
                System.out.println("Player 1 wins");
                p1Wins++;
            } else if ((p1choice.equals("rock")) && (p2choice.equals("scissors"))) {
                System.out.println("Player 1 wins");
                p1Wins++;
            } else if ((p1choice.equals("scissors")) && (p2choice.equals("rock"))) {
                System.out.println("Player 2 wins");
                p2Wins++;
            } else if ((p1choice.equals("scissors")) && (p2choice.equals("paper"))) {
                System.out.println("Player 1 wins");
                p1Wins++;
            } else if ((p1choice.equals("paper")) && (p2choice.equals("scissors"))) {
                System.out.println("Player 2 wins");
                p2Wins++;
            }

            if (p1choice.equals(p2choice)) {
                draw++;
                System.out.println("\n\t\t Draw \n");
            }

            roundsPlayed++;
            if ((p1.getWins() >= 3) || (p2.getWins() >= 3)) {
                gameWon = true;
                System.out.println("GAME WON!");
            }
            System.out.println();
        } while (gameWon != true);
    }
}



