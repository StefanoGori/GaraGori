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
public class Pista{
    
    private int Giri=0;
    Semaforo pieno;
    public Pista(Semaforo pieno){
        this.pieno=pieno;
    }
    
    
    public void InPista(){
        pieno.P();
        System.out.println(Thread.currentThread().getName()+" e' entrato in pista");
        for(Giri=0;Giri<15;Giri++){
            System.out.println(Thread.currentThread().getName()+" ha fatto "+Giri+" giri");
        }
        pieno.V();
        System.out.println(Thread.currentThread().getName()+" ha finito i giri");
    }
}
