/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import persistencia.IReseña;
import entidades.Reseña;
import java.util.ArrayList;
import persistencia.ArrayListReseña;

/**
 *
 * @author POWER
 */
public class LogicaReseña {
        private final IReseña reseñas;

    public LogicaReseña() {
        this.reseñas = new ArrayListReseña();
    }
     public void agregarReseña(Reseña reseña) {
        reseñas.agregarReseña(reseña);
    }

    public ArrayList<Reseña> obtenerReseñas() {
        return reseñas.obtenerReseñas();
    }
}
