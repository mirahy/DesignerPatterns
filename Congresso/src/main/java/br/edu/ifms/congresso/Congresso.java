/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.congresso;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Congresso {
    
    private List<IndividuoCompnent> inscritos = new ArrayList();
    
    public void inscrever(IndividuoCompnent value){
        inscritos.add(value);
        
    }
    
    public int totalParticipantes(){
        return inscritos.size();
    }
    
    public int totalAssentos(){
        int total = 0;
        for (int i = 0; i < totalParticipantes(); i++) {
            total += inscritos.get(i).getAssento();
        }
        return total;
    }
    
}
