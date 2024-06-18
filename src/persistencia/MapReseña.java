/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import persistencia.IRese�a;
import entidades.Rese�a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author POWER
 */
public class MapRese�a implements IRese�a{
     private Map<String, Rese�a> rese�as = new HashMap<>();

    @Override
    public boolean agregarRese�a(Rese�a rese�a) {
        this.rese�as.put(rese�a.getComentario(), rese�a);
        return true;
    }

    @Override
    public ArrayList<Rese�a> obtenerRese�as() {
        return (ArrayList<Rese�a>) rese�as;
    }
}
