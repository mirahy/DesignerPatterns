/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.core2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santos
 */
public class Pedido {
    private BigDecimal valor;
    
    private List<BigDecimal> itens;
    
    public Pedido() {
        valor = BigDecimal.ZERO;
        itens = new ArrayList();
    }
    
    public BigDecimal getValor() {
        return valor;
    }
    
    public List<BigDecimal> getItens() {
        return itens;
    }
}
