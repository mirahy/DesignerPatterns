/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.observer;

/**
 *
 * @author aluno
 */
public class Nota {
    
    private Avaliacao avaliacao;
    private Estudante estudante;
    private Double valor;

    public Nota(Avaliacao avaliacao, Estudante estudante, Double valor) {
        this.avaliacao = avaliacao;
        this.estudante = estudante;
        this.valor = valor;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public Double getValor() {
        return valor;
    }
    
}
