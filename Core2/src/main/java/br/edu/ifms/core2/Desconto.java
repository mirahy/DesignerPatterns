/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifms.core2;

import java.math.BigDecimal;

/**
 *
 * @author santos
 */
public interface Desconto {

    BigDecimal calcular(Pedido pedido);

    void setProximo(Desconto proximo);
}
