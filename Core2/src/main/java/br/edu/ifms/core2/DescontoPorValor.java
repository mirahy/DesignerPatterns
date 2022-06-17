/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.core2;

import java.math.BigDecimal;

/**
 *
 * @author santos
 */
public class DescontoPorValor implements Desconto {
    
    private Desconto proximo;

    @Override
    public BigDecimal calcular(Pedido pedido) {
        if (pedido.getValor().compareTo(BigDecimal.valueOf(1000.0)) > 0) {
            return pedido.getValor().multiply(BigDecimal.valueOf(0.1));
        }
        return proximo.calcular(pedido);
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
    
}
