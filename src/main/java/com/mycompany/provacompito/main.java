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
public class main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Semaforo pieno=new Semaforo(2);
        Semaforo vuoto=new Semaforo(4);
        Pista pi=new Pista(pieno);
        Spogliatoio S=new Spogliatoio(vuoto);
        
        Pilota p1=new Pilota(pieno,vuoto,pi,S);
        Pilota p2=new Pilota(pieno,vuoto,pi,S);
        Pilota p3=new Pilota(pieno,vuoto,pi,S);
        Pilota p4=new Pilota(pieno,vuoto,pi,S);
        Pilota p5=new Pilota(pieno,vuoto,pi,S);
        Pilota p6=new Pilota(pieno,vuoto,pi,S);
        Pilota p7=new Pilota(pieno,vuoto,pi,S);
        Pilota p8=new Pilota(pieno,vuoto,pi,S);
        p1.setName("pilota 1");
        p2.setName("pilota 2");
        p3.setName("pilota 3");
        p4.setName("pilota 4");
        p5.setName("pilota 5");
        p6.setName("pilota 6");
        p7.setName("pilota 7");
        p8.setName("pilota 8");
        
        
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();
        
        

        
        
    }
    
}
