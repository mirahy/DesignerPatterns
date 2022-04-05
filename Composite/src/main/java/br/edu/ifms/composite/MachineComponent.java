/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.composite;

/**
 *
 * @author aluno
 */
public abstract class MachineComponent {  
    private String name;
    
    public  abstract  int getMachineCount();

    public MachineComponent(String name) {
        this.name = name;
    }
  
    
    public String getName(){
        return name;
    }
    public void SetName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "MachineComponent{" + "name=" + name + '}';
    }
    
    
    
    
}
