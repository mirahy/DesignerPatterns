/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.observer;

/**
 *
 * @author aluno
 */
public class Estudante implements Observer{
    
    private String nome;
    
    public  Estudante (Avaliacao avaliacao, String nome){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

    @Override
    public void atualizar(Observable o) {
        if(o instanceof Avaliacao){
            Avaliacao m = (Avaliacao) o;
            m.mostrarMedia(this);
        }
    }
    
}
