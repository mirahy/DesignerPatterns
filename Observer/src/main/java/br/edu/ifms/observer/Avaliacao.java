/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.print.attribute.HashAttributeSet;

/**
 *
 * @author aluno
 */
public class Avaliacao extends Observable{
    
    private List<Nota> notas = new ArrayList();
    
    public  void add(Nota nota){
        notas.add(nota);
        notificar();
    }
    
    public  void remover(Nota nota){
        notas.remove(nota);
        notificar();
    }
    
    private HashMap<Estudante, Media> calcular(){
        HashMap<Estudante, Media> map = new HashMap();
        int itens = 0;
        for(Nota n : notas){
           Estudante e = n.getEstudante();
           Media media = null;
           if(map.containsKey(e)){
               media = map.get(e);
               media.add(n.getValor());
           }else{
               media = new Media(n.getValor());
               
           }
           map.put(e, media);
        }
        return map;
    }
    
    public void mostrarMedia(){
        HashMap<Estudante, Media> map = calcular();
        
        if(map.containsKey(e)){
            Media media = map.get(e);
            System.out.println("Estudante %s = Media: %.2f\n, ", e.getResultado());
        }else{
            
        }
    }
    
}
