/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.composite;

/**
 *
 * @author aluno
 */
public class Machine extends MachineComponent{

    public Machine(String name) {
        super(name);
    }

    

    @Override
    public int getMachineCount() {
        return 1;
    }
    
    
    
}
