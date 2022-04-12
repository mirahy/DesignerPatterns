/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.core;

import java.math.BigDecimal;

/**
 *
 * @author aluno
 */
public class DescontoPorValor implements Desconto{
    
    private Desconto proximo;

    @Override
    public Double calcular(Pedido pedido) {
        if(pedido.getValor() > 1000){
            return pedido.getValor()*Double.valueOf(0.10);
        }else{
            return proximo.calcular(pedido);
        }
        
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
    
}
