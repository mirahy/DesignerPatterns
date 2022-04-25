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
public class CalculadorDeDesconto1 {

    public static void main(String[] args) {
        final Pedido pedido = new Pedido();
        BigDecimal valor = calculaDesconto(pedido);
        System.out.printf("%.2f\n", valor);
    }

    public static BigDecimal calculaDesconto(Pedido pedido) {
        final Desconto descontoPorItem = new DescontoPorItens();
        final Desconto descontoPorValor = new DescontoPorValor();
        final Desconto semDesconto = new SemDesconto();
        
        descontoPorItem.setProximo(descontoPorValor);
        descontoPorValor.setProximo(semDesconto);
        return descontoPorItem.calcular(pedido);
    }
}
