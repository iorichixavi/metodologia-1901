/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

public class TarjetaCredito extends Tarjeta {

    @Override
    public void pagar(float deposito){ 
            this.setSaldo(getSaldo()+deposito-deposito*0.03f);
    }

}
