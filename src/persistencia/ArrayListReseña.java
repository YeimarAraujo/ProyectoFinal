/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidades.Rese�a;
import java.util.ArrayList;

/**
 *
 * @author POWER
 */
public class ArrayListRese�a implements IRese�a{
     private ArrayList<Rese�a> rese�as = new ArrayList<>();

    @Override
    public boolean agregarRese�a(Rese�a rese�a) {
      return  rese�as.add(rese�a);
    }

    @Override
    public ArrayList<Rese�a> obtenerRese�as() {
        return rese�as; }
}
