/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.entornos;

/**
 *
 * @author Jorge
 */
public class ProyectoEntornos {

    
     
    
    public double realizarPago(double precio, double dinero){
        
        double resultado;
        resultado = dinero-precio;
        return resultado;
            
    }
    
    public boolean verCuentaBancaria(String puesto){
        boolean puede = false;
        if (puesto.equalsIgnoreCase("Administrador")) {
            puede = true;
        }
        return puede;
    }
}
