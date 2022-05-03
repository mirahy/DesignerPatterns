/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.factorymethod;

/**
 *
 * @author aluno
 */
public class TesteFactory {
    public static void main(String[] args) {
        FormaFactory circuloFactory = new CirculoFactory();
        Forma circulo = circuloFactory.getForma();
        circulo.desenhar();
        
        FormaFactory retanguloFactory = new RetanguloFactory();
        Forma retangulo = retanguloFactory.getForma();
        retangulo.desenhar();
    }
}
