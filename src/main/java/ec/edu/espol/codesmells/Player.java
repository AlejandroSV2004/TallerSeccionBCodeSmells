/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.codesmells;

/**
 *
 * @author aleja
 */
public class Player {
    String nombre;
    int wins;       // # of wins
    Opcion choice;

    public Player(){
        this.wins = 0;
        this.choice = null;
    }
    public Opcion getChoice() {
        return choice;
    }

    public int getWins() {
        return wins;
    }
    public void increVictorias(){
        this.wins++;
    }
}

