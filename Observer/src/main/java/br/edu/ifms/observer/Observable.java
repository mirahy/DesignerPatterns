/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Observable {
    
    private  List<Observer> observers = new ArrayList();
    
    public  void adicionar(Observer o){
        observers.add(o);
    }
    
    public  void remover(Observer o){
        observers.remove(o);
    }
    
    public void notificar(){
        for (int i = 0; i < observers.size(); i++) {
            Observer o = observers.get(i);
            o.atualizar(this);
        }
   
    }
    
}
