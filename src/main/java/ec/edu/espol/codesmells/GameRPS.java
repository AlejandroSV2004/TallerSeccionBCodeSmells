/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.codesmells;

/**
 *
 * @author aleja
 */
public class GameRPS {
    Player p1 = new Player();
    Player p2 = new Player();
    int draw = 0;
    int rondas = 0;
    boolean gameWon;
    
    public void jugar(){
        do {
            actualizarEmpates();
            imprimirInformacion();
            actualizarOpciones();
            RPSLogic.enfrentar(p1, p2);
            rondas++;
            actEstadoJuego();
        } while (gameWon != true);
    }
    public void imprimirInformacion(){
        System.out.println("****** Round: " + (rondas+1) + " ***************\n");
        System.out.println("Number of Draws: " + draw + "\n");
        System.out.println("Player 1 Total Wins: " + p1.getWins());
        System.out.println("Player 2 Total Wins: " + p2.getWins());
    }
    public void actualizarEmpates(){
        draw = rondas - p1.getWins() - p2.getWins();
    }
    public void actualizarOpciones(){
        RPSLogic.playerChoice(p1);
        RPSLogic.playerChoice(p2);
        System.out.println("Player 1 chose " + p1.getChoice().descripcion + " and Player 2 chose " + p2.getChoice().descripcion + "\n");
    }
    
    public void actEstadoJuego(){
        if ((p1.getWins() >= 3) || (p2.getWins() >= 3)) {
                gameWon = true;
                System.out.println("GAME WON!");
            }
    }
}
