/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.provacompito;

/**
 *
 * @author stefa
 */
public class Semaforo {
    int valore;

    public Semaforo(int valore) {
        this.valore = valore;
    }
    synchronized void P(){
        while(valore==0){
            try{
                wait();
            }
            catch(InterruptedException e){
                
            }
            valore--;
        }
    }
    synchronized void V(){
        valore++;
        notify();
    }
}
