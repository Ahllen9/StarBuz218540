/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pruebas;

import Bebidas.HouseBlend;
import StarbuzCafe.Beverage;

/**
 *
 * @author arturo
 */
public class Test {
    public static void main(String[] args) {
        Beverage bebida1 = new HouseBlend();
        System.out.println(bebida1.getDescrpcion());
        bebida1.Costo();
    }
}
