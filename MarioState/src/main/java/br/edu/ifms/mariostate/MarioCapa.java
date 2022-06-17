/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.mariostate;

/**
 *
 * @author aluno
 */
public class MarioCapa implements MarioState{

    @Override
    public MarioState pegarCogumelo() {
        System.out.println("Mario ganhou 1000 pontos");
        return this;
    }

    @Override
    public MarioState pegarFlor() {
        System.out.println("Mario com fogo");
        return new MarioFogo();
    }

    @Override
    public MarioState pegarPena() {
        System.out.println("Mario ganhou 1000 pontos");
        return this;
    }

    @Override
    public MarioState LevarDano() {
        System.out.println("Mario garnde");
        return new MarioGrande();
    }
    
}
