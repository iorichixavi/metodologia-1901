/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1;

/**
 *
 * @author iorichi xavi
 */
class Imc {
   persona p;        /*Clase persona en p es un atributo  */
   float valor;
   void  calcular(){    /*El metodo sera calcular*/   
       /* Si no tiene retorno el metodo ponerle void antes de todo*/
   valor=p.peso/(p.altura*p.altura);
    }
}
