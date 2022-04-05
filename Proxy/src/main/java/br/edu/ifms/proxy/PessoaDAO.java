/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.proxy;

/**
 *
 * @author aluno
 */
public class PessoaDAO {
    
    public static Pessoa getPessoaByID(String id){
        System.out.println("select * from pessoa where" + id + "id = " + id);
        
        return new PessoaImpl( id, "Pessoa" + id);
    }
    
}
