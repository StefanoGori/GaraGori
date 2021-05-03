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
public class Spogliatoio {
    
    Semaforo vuoto;
    
    public Spogliatoio(Semaforo vuoto){
        this.vuoto = vuoto;
    }
    
    public void Cambia1(){
        vuoto.P();
        System.out.println(Thread.currentThread().getName()+" si sta cambiando");
    }
    public void Cambia2(){
        vuoto.V();
        System.out.println(Thread.currentThread().getName()+" si sta ricambiando");
    }
}
