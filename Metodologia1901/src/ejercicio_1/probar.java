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
public class probar {
    public static void main(String[] args) {
        persona p=new persona();
        p.altura=1.75f;
        p.peso=79;
        
        Imc x=new Imc();
        x.p=p;
        x.calcular();
        System.out.println("El valor es......."+x.valor);
    }
  
    
}
