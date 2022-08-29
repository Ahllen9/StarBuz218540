/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pruebas;

import Bebidas.HouseBlend;
import Decoradores.Milk;
import StarbuzCafe.Beverage;
import StarbuzCafe.Complemento;

/**
 *
 * @author arturo
 */
public class Test {
    public static void main(String[] args) {
        Beverage bebida1 = new HouseBlend();
//        System.out.println(bebida1.getDescrpcion()+" $"+ bebida1.getCosto());        
        
        Complemento complemento1 = new Milk(bebida1);
        System.out.println(complemento1.getDescripcion()+" $"+complemento1.getCosto());
    }
}
