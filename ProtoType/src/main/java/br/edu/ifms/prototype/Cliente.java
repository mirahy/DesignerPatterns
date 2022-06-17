package br.edu.ifms.prototype;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Cliente {
    
    String nome;
    Integer idade;
    String endereco;
    String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public  Cliente clone(){
        Cliente instance = new Cliente();
        instance.setNome(this.nome);
        instance.setIdade(this.idade);
        instance.setEndereco(this.endereco);
        instance.setTelefone(this.telefone);
        return instance;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + ", telefone=" + telefone + '}';
    }
    
    
}
