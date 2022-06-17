/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.builder.exemplo2;

/**
 *
 * @author aluno
 */
public class PaisDiretor extends DiretorBaseObject{
    @Override
    public Pais construir(){
        return new Pais(this);
    }
}
