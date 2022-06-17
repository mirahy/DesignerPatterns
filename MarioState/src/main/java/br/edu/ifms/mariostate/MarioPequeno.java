/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifms.mariostate;

/**
 *
 * @author aluno
 */
public class MarioPequeno implements MarioState{

    @Override
    public MarioState pegarCogumelo() {
        System.out.println("Mario grande");
        return new MarioGrande();
    }

    @Override
    public MarioState pegarFlor() {
        System.out.println("Mario grande com fogo");
        return new MarioFogo();
    }

    @Override
    public MarioState pegarPena() {
        System.out.println("Mario grande com capa");
        return new MarioCapa();
    }

    @Override
    public MarioState LevarDano() {
        System.out.println("Mario morto");
        return new MarioMorto();
    }
    
}
