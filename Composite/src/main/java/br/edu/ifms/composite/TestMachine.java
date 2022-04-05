/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.composite;

/**
 *
 * @author aluno
 */
public class TestMachine {
    
    public static void main(String[] args) {
        
        Machine botaoDireito = new Machine("botaoDireito");
        Machine botaoEsquerdo = new Machine("botaoEsquerdo");
        Machine botaoScroll = new Machine("botaoEsquerdo");
        
        MachineComposite mouse = new MachineComposite("Mouse");
        mouse.add(botaoDireito);
        mouse.add(botaoEsquerdo);
        mouse.add(botaoScroll);
       
        
        Machine teclado = new Machine("Teclado");
        Machine monitor = new Machine("Monitor");
        
        MachineComposite computador = new MachineComposite("Computador");
        computador.add(teclado);
        computador.add(monitor);
        computador.add(mouse);
        
        System.out.println(computador);
    }
    
}
