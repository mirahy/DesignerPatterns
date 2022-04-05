/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class ProxyExample {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList();
        
        pessoas.add(new ProxyPessoa("A"));
        pessoas.add(new ProxyPessoa("B"));
        pessoas.add(new ProxyPessoa("C"));
        
        System.out.printf("Nome: %s\n", pessoas.get(0).getNome());
        System.out.printf("Nome: %s\n", pessoas.get(1).getNome());
        System.out.printf("Nome: %s\n", pessoas.get(0).getNome());
        
        System.out.printf("Id da 3.a %s\n", pessoas.get(2).getId());
        
    }
    
}
