/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidades.Rese�a;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author POWER
 */
public  interface IRese�a extends Serializable{
    boolean agregarRese�a(Rese�a rese�a);
    ArrayList<Rese�a> obtenerRese�as();
}
