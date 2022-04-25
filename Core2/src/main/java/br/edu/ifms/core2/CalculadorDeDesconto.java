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
public class CalculadorDeDesconto {

    public static void main(String[] args) {
        final Pedido pedido = new Pedido();
        BigDecimal valor = calculaDesconto(pedido);
        System.out.printf("%.2f\n", valor);
    }

    public static BigDecimal calculaDesconto(Pedido pedido) {
        if (pedido.getItens().size() > 10) {
            return pedido.getValor().multiply(BigDecimal.valueOf(0.05));
        } else if (pedido.getValor().compareTo(BigDecimal.valueOf(1000.0)) > 0) {
            return pedido.getValor().multiply(BigDecimal.valueOf(0.10));
        } else {
            return BigDecimal.ZERO;
        }
    }
}
