/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thrent1;

/**
 *
 * @author T-107
 */
public class ProbarTarea extends Thread {

    public static void main(String[] args) {
        TareaBasica t1 = new TareaBasica();
        t1.start();

        TareaHora t2 = new TareaHora();
        t2.start();
    }

}
