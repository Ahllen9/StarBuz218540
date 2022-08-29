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
public class HouseBlend extends Beverage{

    public HouseBlend() {
        super.Descrpcion = "HouseBlend";
    }

    @Override
    public void Costo() {
        System.out.println(25);
    }
}
