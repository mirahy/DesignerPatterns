/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.core;

/**
 *
 * @author aluno
 */
public class DescontoPorItem implements Desconto{
    
    private Desconto proximo;
    
    @Override
    public Double calcular(Pedido pedido) {
        if(pedido.getItens().size() > 10){
            return pedido.getValor() * 0.5;

        }else{
            return proximo.calcular(pedido);
        }
    }
    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }

    
    
}
