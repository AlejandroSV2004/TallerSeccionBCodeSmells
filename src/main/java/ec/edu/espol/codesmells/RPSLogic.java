/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.codesmells;

/**
 *
 * @author aleja
 */
public class RPSLogic {
    public static void playerChoice(Player jugador) {
        int c = (int)(Math.random() * 3);
        switch(c) {
            case 0:
                jugador.choice = new Piedra();
                break;
            case 1:
                jugador.choice = new Papel();
                break;
            case 2:
                jugador.choice = new Tijera();
                break;
        }
    }
    
    public static void enfrentar(Player j1, Player j2){
        Opcion ojugador1 = j1.getChoice();
        Opcion ojugador2 = j2.getChoice();
        if(ojugador1.empataContra(ojugador2)){
            System.out.println("EMPATE");
        }else if(ojugador1.ganaContra(ojugador2)){
            System.out.println("GANA JUGADOR 1");
            j1.increVictorias();
        }else{
            System.out.println("GANA JUGADOR 2");
            j2.increVictorias();
        }
    }
}
