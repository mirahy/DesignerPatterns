/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class MachineComposite extends MachineComponent{
    private final List<MachineComponent> list = new ArrayList();

    public MachineComposite(String name) {
        super(name);
    }

    @Override
    public int getMachineCount() {
        return list.size();
    }
    
    public void add(MachineComponent componente){
        list.add(componente);
    }
    
    public void remove(MachineComponent componente){
        list.remove(componente);
    }
    
    public MachineComponent getChild(int index){
        return list.get(index);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MachineComposite{" + "Name=" + getName() + "}\n");
        
        for(MachineComponent c : list){
            sb.append("--" + c.toString() + "\n");
        }
        
        return sb.toString();
    }
    
    
    
}