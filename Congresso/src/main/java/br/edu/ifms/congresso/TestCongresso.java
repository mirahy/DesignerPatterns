/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.congresso;

/**
 *
 * @author aluno
 */
public class TestCongresso {
    
    public static void main(String[] args) {
        
        Individuo indviduo1 = new Individuo("indviduo1");
        Individuo indviduo2 = new Individuo("indviduo2");
        Individuo indviduo3 = new Individuo("indviduo3");
        
        Instituicao ifms = new Instituicao("IFMS");
        ifms.add(new Individuo("indivudio4"))
                .add(new Individuo("indivudio5"))
                .add(new Individuo("indivudio6"));
        
        Congresso congresso = new Congresso();
        congresso.inscrever(indviduo1);
        congresso.inscrever(indviduo2);
        congresso.inscrever(ifms);
        
        System.out.println("Numero de participantes:" + congresso.totalParticipantes() );
        System.out.println("Numero de assentos:" + congresso.totalAssentos());
        
    }
    
}
