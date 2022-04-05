/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.observer;

/**
 *
 * @author aluno
 */
public class TesteAvaliacao {
    
    public static void main(String[] args) {
        Avaliacao avaliacao = new Avaliacao();
        Estudante gustavo = new Estudante(avaliacao, "Gustavo");
        Estudante douglas = new Estudante(avaliacao, "Douglas");
        
        avaliacao.add(new Nota(avaliacao, gustavo, 7,0));
        avaliacao.add(new Nota(avaliacao, gustavo, 8,0));
        avaliacao.add(new Nota(avaliacao, gustavo, 9,0));
        
        avaliacao.add(new Nota(avaliacao, duglas, 7,0));
        avaliacao.add(new Nota(avaliacao, duglas, 6,0));
        avaliacao.add(new Nota(avaliacao, duglas, 5,0));
    }
    
}
