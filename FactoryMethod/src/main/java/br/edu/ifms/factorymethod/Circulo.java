/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.factorymethod;

/**
 *
 * @author aluno
 */
public class Circulo implements Forma{
    
    private Double raio;
    
    public Circulo(Double raio){
        this.raio = raio;
    }
    
    @Override
    public void desenhar() {
        System.out.println("Circulo Desenhado!");
    }
    
}
