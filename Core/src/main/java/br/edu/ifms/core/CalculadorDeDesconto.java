/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.core;

/**
 *
 * @author Talita Fonseca
 */
public class CalculadorDeDesconto {
     
    public Double calculaDesconto(Pedido pedido){
        final Desconto descontoPorItem = new DescontoPorItem();
        final Desconto descontoPorValor = new DescontoPorValor();
        final Desconto semDesconto = new SemDesconto();
        
        descontoPorItem.setProximo(descontoPorValor);
        descontoPorValor.setProximo(semDesconto);
        
        return descontoPorItem.calcular(pedido);
    }
    
    public static void main(String[] args) {
            final Pedido pedido = new Pedido();
            
    }
    
}
