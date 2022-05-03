/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.builder.exemplo2;

/**
 *
 * @author aluno
 */
public class UfDirector extends DiretorBaseObject{
    
    private Pais pais;
    private String sigla;
    
    @Override
    public UF construir(){
        return new UF(this);
    }
    
    public UfDirector wihtPais(Pais pais){
        this.pais = pais;
        return this;
    }
    
    public UfDirector wihtSigla(String sigla){
        this.sigla = sigla;
        return this;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    
    
}
