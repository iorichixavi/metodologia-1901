/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author xaviiorichi
 */
public class Banco {
    public static void main(String[] args){
        //primero creamos la tarjeta de credito
        TarjetaCredito t1=new TarjetaCredito();
        //le asignamos un numero
        t1.setNumero(12345);
        TarjetaAhorro t2=new TarjetaAhorro();
       /* t2.setNumero(2345);
        TarjetaNomina t3=new TarjetaNomina();
        t3.setNumero(5678);
        */
      System.out.println("El numero de la tarjeta t3 es "+t1.getNumero());
    }
}
