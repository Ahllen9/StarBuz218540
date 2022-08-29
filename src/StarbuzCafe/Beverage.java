/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StarbuzCafe;

/**
 *
 * @author arturo
 */
public abstract class Beverage {
    public String Descrpcion;

    public String getDescrpcion() {
        return Descrpcion;
    }
    
    public abstract double getCosto();
}
