/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.prototype;

/**
 *
 * @author aluno
 */
public class TesteCliente {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Mirahy");
        cliente.setIdade(32);
        cliente.setEndereco("Centro");
        cliente.setTelefone("67 9999-8888");
        
        System.out.println(cliente);
        
        Cliente filho = cliente.clone();
        filho.setNome("Miguel");
        filho.setIdade(5);
        
        System.out.println(filho);
        System.out.println(cliente);
    }
}
