/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bebidas;

import StarbuzCafe.Beverage;

/**
 *
 * @author arturo
 */
public class Expresso extends Beverage{
    public Expresso() {
        super.Descrpcion = "Expresso";
    }

    @Override
    public double getCosto() {
        return 65;
    }
}
