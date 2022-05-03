/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.builder.exemplo2;

/**
 *
 * @author aluno
 */
public class Cidade extends BaseObject{
    
    private UF uf;
    
    public Cidade() {
    }

    public Cidade(CidadeDiretor diretor) {
        super.setId(diretor.id);
        super.setNome(diretor.nome);
        uf = diretor.uf;
    }

    public UF getUf() {
        return uf;
    }

    public void setUf(UF uf) {
        this.uf = uf;
    }
    
    public static class CidadeDiretor {
        private Long id;
        private String nome;
        private UF uf;
        
        public CidadeDiretor wihtId(Long id){
            this.id = id;
            return this;
        }
        
        public CidadeDiretor wihtNome(String nome){
            this.nome = nome;
            return this;
        }
        
        public CidadeDiretor wihtUf(UF uf){
            this.uf = uf;
            return this;
        }
        
        public Cidade construir(){
            return new Cidade(this);
        }
    }
    
}
