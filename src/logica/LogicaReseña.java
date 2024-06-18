/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import persistencia.IRese�a;
import entidades.Rese�a;
import java.util.ArrayList;
import persistencia.ArrayListRese�a;

/**
 *
 * @author POWER
 */
public class LogicaRese�a {
        private final IRese�a rese�as;

    public LogicaRese�a() {
        this.rese�as = new ArrayListRese�a();
    }
     public void agregarRese�a(Rese�a rese�a) {
        rese�as.agregarRese�a(rese�a);
    }

    public ArrayList<Rese�a> obtenerRese�as() {
        return rese�as.obtenerRese�as();
    }
}
