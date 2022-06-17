/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.builder;

/**
 *
 * @author aluno
 */
public class ClienteTeste {
    
    public static void main(String[] args) {
        Cliente c = new Cliente();
        Cliente c2 = new Cliente(2, "Robison");
        Cliente c3 = new Cliente(2, "Fabricio", "111.111.111-11");
        Cliente c4 = new Cliente("Maria", "111.111.111-11");
    }
    
}
