/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StarbuzCafe;

/**
 *
 * @author arturo
 */
public abstract class Complemento extends Beverage{
    Beverage bebida;
    
    public abstract String getDescripcion();
    
    public double Costo(){
        return bebida.Costo();
    };
}
