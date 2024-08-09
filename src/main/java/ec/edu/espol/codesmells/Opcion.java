/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.codesmells;

/**
 *
 * @author aleja
 */
public abstract class Opcion {

    String descripcion;
    String debilidad;

    public String getDescripcion() {
        return descripcion;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public boolean ganaContra(Opcion op) {
        return op.debilidad.equals(this.descripcion);
    }

    public boolean empataContra(Opcion op) {
        return (!op.descripcion.equals(this.debilidad) && !this.descripcion.equals(op.debilidad));
    }
}
