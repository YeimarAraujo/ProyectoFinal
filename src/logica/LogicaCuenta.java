

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import entidades.Cliente;
import entidades.CuentaUsuarios;
import entidades.Emprendedor;
import java.util.ArrayList;
import persistencia.ArrayListCuenta;

import persistencia.ICuenta;
import presentacion.Menu;

/**
 *
 * @author POWER
 */
public class LogicaCuenta {
    private final ICuenta persistencia;
    private ArrayList<CuentaUsuarios> cuentas;
   
    public LogicaCuenta() {
        this.persistencia = new ArrayListCuenta();
    this.cuentas = new ArrayList<>(); 

    }
    
    public void login(String username, String password) {
    boolean registrado = false;
    for (CuentaUsuarios cuenta : cuentas) {
        if (cuenta.getUsername().equals(username) && cuenta.getPassword().equals(password)) {
            System.out.println("Inicio de sesión exitoso!");
            registrado = true;
            
            if (cuenta.Emprendedor()) {
                new Menu().menuEmprendedor();
                break;
            } 
            
            if(cuenta.Cliente()){
                new Menu().menuUsuario();
                break;
            }
            break; 
        }
    }
    if (!registrado) {
        System.out.println("Usuario no registrado... Favor registrarse");
    }
}

    public CuentaUsuarios crearCuenta(String username, String password, String correoElectronico, String cedula, int edad, int tipo){
     
         switch (tipo) {
            case 1:
                return new Cliente(username, password, correoElectronico, cedula, edad);
               
            case 2:
                return new Emprendedor(username, password, correoElectronico, cedula, edad);
               
            default: return null;
        }
         
    }
    public boolean registrar(CuentaUsuarios cuenta) {
  boolean result = this.persistencia.agregarCuenta(cuenta);
    if (result) {
        cuentas.add(cuenta); 
    }
    return result;
}
    public boolean eliminar (CuentaUsuarios cuenta){
        
        return this.persistencia.eliminar(cuenta);
    }
    

}