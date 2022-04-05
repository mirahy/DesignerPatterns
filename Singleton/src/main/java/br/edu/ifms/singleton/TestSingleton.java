package br.edu.ifms.singleton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class TestSingleton {
    
    public static void main(String[] args) {
        Singleton obj  =  Singleton.getInstancia();
        Singleton obj2 =  Singleton.getInstancia();
        
        System.out.println(Singleton.getCount());
    }
    
}
