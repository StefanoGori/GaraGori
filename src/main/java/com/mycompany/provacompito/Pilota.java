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
public class Pilota extends Thread{
    Semaforo P;
    Semaforo V;   
    Pista Pi;
    Spogliatoio S;

    public Pilota(Semaforo P, Semaforo V, Pista Pi, Spogliatoio S) {
        this.P = P;
        this.V = V;
        this.Pi = Pi;
        this.S = S;
    }
    
    public void run(){
        
        S.Cambia1();
        Pi.InPista();
        S.Cambia2();
        
    }
    
    
    
}
