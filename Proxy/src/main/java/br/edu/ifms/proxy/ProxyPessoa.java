/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.proxy;

/**
 *
 * @author aluno
 */
public class ProxyPessoa implements Pessoa{
    
    private String id;
    private Pessoa pessoa;

    public ProxyPessoa(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getNome() {
        if(pessoa == null){
            pessoa = PessoaDAO.getPessoaByID(id);  
        }
        return pessoa.getNome();
    }
    
}
