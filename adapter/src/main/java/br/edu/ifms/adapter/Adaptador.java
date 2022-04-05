/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.adapter;

/**
 *
 * @author aluno
 */
public class Adaptador extends ClasseExistente implements Alvo{

    @Override
    public void operacao() {
        String texto = metodoUtilDois("Operação realizado!!!");
        metodoUtilUm(texto);
    }
    
}
