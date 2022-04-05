/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.observer;

/**
 *
 * @author aluno
 */
public class Media {
    
    private Integer quantidade;
    private Double soma;

    public Media() {
    }

    public Media( Double soma) {
        this.quantidade = 1;
        this.soma = soma;
    }
    
    public void inc(){
        this.quantidade++;
    }
    
    public  void add(Double valor){
        this.soma += valor;
        inc();
    }
    
    public Double getResultado(){
        return soma /quantidade;
    }
}
