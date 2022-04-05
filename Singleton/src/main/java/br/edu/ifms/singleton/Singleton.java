/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.singleton;

/**
 *
 * @author aluno
 */
public class Singleton {
    
    private static int count =0;
    
    private static Singleton instancia = null;

    private Singleton() {
        count++;
    }
    
    
    public static  Singleton getInstancia(){
        if(instancia == null){
            instancia = new Singleton();
        }
        return instancia;
    }
    
    public static int getCount(){
        return count;
    }
}
