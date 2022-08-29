/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decoradores;

import StarbuzCafe.Complemento;

/**
 *
 * @author arturo
 */
public class Soy extends Complemento {

    @Override
    public String getDescripcion() {
        return super.Descrpcion+" "+"soy";
    }

    @Override
    public double Costo() {
        return super.Costo()+10;
    }
    
}
