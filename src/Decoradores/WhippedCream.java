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
public class WhippedCream extends Complemento{

    @Override
    public String getDescripcion() {
        return super.Descrpcion+" "+"WhippedCream";
    }

    @Override
    public double Costo() {
        return super.Costo()+10;
    }
}
