/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.core;

/**
 *
 * @author aluno
 */
public class SemDesconto implements Desconto{

    @Override
    public Double calcular(Pedido pedido) {
        return 0.0;
    }

    @Override
    public void setProximo(Desconto proximo) {
        // Nao faz nada , eh o ultimo nivel
    }
    
}
