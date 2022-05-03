/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.builder.exemplo2;

/**
 *
 * @author aluno
 */
public class BaseObject {
     private Long id;
     private String nome;
     
     public BaseObject (){}
     
     public BaseObject(DiretorBaseObject diretor){
         id = diretor.getId();
         nome = diretor.getNome();
     }
     
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "BaseObject{" + "id=" + id + ", nome=" + nome + '}';
    }
    
    
      
}
