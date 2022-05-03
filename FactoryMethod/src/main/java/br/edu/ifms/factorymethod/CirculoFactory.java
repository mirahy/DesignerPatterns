/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.factorymethod;

/**
 *
 * @author aluno
 */
public class CirculoFactory implements FormaFactory{

    @Override
    public Forma getForma() {
        return new Circulo(1.5);
    }
    
}
