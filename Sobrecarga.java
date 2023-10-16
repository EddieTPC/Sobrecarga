
package com.mycompany.sobrecarga;
//Tenemos nuestra clase principal
public class Sobrecarga {
    //Creamos una cadena para mostrar en metodoSobrecargado()
    static String cadena="Este método esta sobrecargado";
    
    //Creamos un método sin parametros.
    public void metodoSobrecargado(){
        System.out.println("Este método esta sobrecargado");
    }
    //Creamos otro metodo con el mismo nombre, pero agreamos un parametro.
    public void metodoSobrecargado(String cadena){
        System.out.println(cadena);
    }
    public static void main(String[] args) {
        //Creamos un objeto de nuestra clase Sobrecarga
       Sobrecarga objeto= new Sobrecarga();
       //Se muestran ambos metodos con el mismo identificador
       objeto.metodoSobrecargado();
       objeto.metodoSobrecargado(cadena);
    }
}
