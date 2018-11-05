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
     
 TarjetaCredito tcredito=new TarjetaCredito();
 tcredito.setNumero(1234);
 tcredito.setNombre("banamex");
 tcredito.setTipo("credito");
tcredito.setSaldo(100);
 
 
 TarjetaAhorro tahorro=new TarjetaAhorro();
 tahorro.setNumero(2345);
 tahorro.setNombre("bancomer");
 tahorro.setTipo("ahorro");
tahorro.setSaldo(100);

 TarjetaNomina tnomina=new TarjetaNomina();
 tnomina.setNumero(3456);
 tnomina.setNombre("hsbc");
 tnomina.setTipo("nomina");
 tnomina.setSaldo(100);
 
 
 //gemeramos el codigo del deposito 
 //vamos hacerlo de la forma mas basica 
 
  tcredito.pagar(150);
  tnomina.pagar(150);
  tahorro.pagar(150);
  
  //generar arreglo de tarjetas 
  
  Tarjeta tarjetas[]=new Tarjeta[3];
  
  tarjetas[0]=tnomina;
  tarjetas[1]=tcredito;
  tarjetas[2]=tahorro;
  
  //iteramos el areglo
  
  for(Tarjeta t: tarjetas){
      System.out.println("Saldo es: "+t.getSaldo());
  }
 
 }
 
}
