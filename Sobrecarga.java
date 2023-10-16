/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sobrecarga;

/**
 *
 * @author a
 */
public class Sobrecarga {
    static String cadena="Este método esta sobrecargado";
    
    public void metodoSobrecargado(){
        System.out.println("Este método esta sobrecargado");
    }
    public void metodoSobrecargado(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
       Sobrecarga objeto= new Sobrecarga();
       
       objeto.metodoSobrecargado();
       objeto.metodoSobrecargado(cadena);
    }
}
