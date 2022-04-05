package br.edu.ifms.proxy;


import br.edu.ifms.proxy.Pessoa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class PessoaImpl implements Pessoa{
    
    private String id;
    private String nome;

    public PessoaImpl(String id, String nome) {
        this.id = id;
        this.nome = nome;
        System.out.println("Retornou a pessao do banco de dados ->" + nome);
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getNome() {
        return nome;
    }
    
}
