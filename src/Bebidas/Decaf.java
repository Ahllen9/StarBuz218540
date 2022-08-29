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
public class Decaf extends Beverage{
    public Decaf() {
        super.Descrpcion = "Decaf";
    }

    @Override
    public double getCosto() {
        return 50;
    }
}
