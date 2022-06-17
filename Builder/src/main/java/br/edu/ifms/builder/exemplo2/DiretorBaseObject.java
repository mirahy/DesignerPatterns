/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.builder.exemplo2;

/**
 *
 * @author aluno
 */
public class DiretorBaseObject {
    private Long id;
    private String nome;
    
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    
    public DiretorBaseObject wihtId(Long id){
        this.id = id;
        return this;
    }
    
    public DiretorBaseObject wihtNome(String nome){
        this.nome = nome;
        return  this;
    }
    
    public BaseObject construir(){
        return new BaseObject(this);
       // BaseObject bo = new BaseObject();
       // bo.setId(id);
       // bo.setNome(nome);
       // return bo;
    }

    
    
}
