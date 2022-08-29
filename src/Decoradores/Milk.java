/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decoradores;

import StarbuzCafe.Beverage;
import StarbuzCafe.Complemento;

/**
 *
 * @author arturo
 */
public class Milk extends Complemento{

   private final Beverage bebida;

    public Milk(Beverage bebida) {
        this.bebida = bebida;
    }
    
    @Override
    public String getDescripcion() {
        return bebida.getDescrpcion()+" soy";
    }

    @Override
    public double getCosto() {
        return bebida.getCosto()+10;
    }
}
