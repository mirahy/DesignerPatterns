/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.builder.exemplo2;

/**
 *
 * @author aluno
 */
public class TesteBuilder {
    public static void main(String[] args) {
        BaseObject bo = new BaseObject();
        System.out.println(bo);
        
        DiretorBaseObject diretor = new DiretorBaseObject();
        BaseObject bo1 = diretor.wihtId(1L).construir();
        
        System.out.println(bo1);
        
        BaseObject bo2 = diretor
                .wihtId(2L)
                .wihtNome("Sapucaia")
                .construir();
        System.out.println(bo2);
        
        BaseObject bo3 = diretor
                .wihtNome("Sandra")
                .construir();
        System.out.println(bo3);
        
        PaisDiretor paisdiretor= new PaisDiretor();
        Pais p = (Pais) paisdiretor
                .wihtId(1L)
                .wihtNome("Brasil")
                .construir();
        System.out.println(p);
        
        UfDirector ufDiretor = new UfDirector();
        UF uf = (UF) ufDiretor
                .wihtPais(p)
                .wihtSigla("MS")
                .wihtId(1L)
                .wihtNome("Mato Grosso do Sul")
                .construir();
        System.out.println(uf);
        
        Cidade city1 = new Cidade.CidadeDiretor()
                .wihtId(1L)
                .wihtNome("Naviraí")
                .wihtUf(uf)
                .construir();
        System.out.println(city1);
    }
}
