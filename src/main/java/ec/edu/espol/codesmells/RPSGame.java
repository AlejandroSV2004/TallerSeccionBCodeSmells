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
        int roundsPlayed = 0;   // Number of rounds played
        int draw = 0;
        boolean gameWon = false;
        // Game loop
        do {
            draw = roundsPlayed - p1.getWins() - p2.getWins();
            System.out.println("****** Round: " + (roundsPlayed+1) + " ***************\n");
            System.out.println("Number of Draws: " + draw + "\n");
            RPSLogic.playerChoice(p1);
            System.out.println("Player 1 Total Wins: " + p1.getWins());
            RPSLogic.playerChoice(p2);
            System.out.println("Player 2 Total Wins: " + p2.getWins());
            System.out.println("Player 1 chose " + p1.getChoice().descripcion + " and Player 2 chose " + p2.getChoice().descripcion + "\n");
            RPSLogic.enfrentar(p1, p2);
            roundsPlayed++;
            if ((p1.getWins() >= 3) || (p2.getWins() >= 3)) {
                gameWon = true;
                System.out.println("GAME WON!");
            }
            System.out.println();
        } while (gameWon != true);
    }
}



