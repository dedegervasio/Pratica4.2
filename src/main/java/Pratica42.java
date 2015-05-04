/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import utfpr.ct.dainf.if62c.pratica.Circulo;
import utfpr.ct.dainf.if62c.pratica.Elipse;

/**
 *
 * @author a1614193
 */
public class Pratica42 {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(4);
        Elipse elipse = new Elipse (2,5);
        
        System.out.println("Area elipse: " + elipse.getArea() + " Perimetro elipse: " + elipse.getPerimetro());
        System.out.println("Area circulo: " + circulo.getArea() + " Perimetro circulo: " + circulo.getPerimetro());
    }
}
