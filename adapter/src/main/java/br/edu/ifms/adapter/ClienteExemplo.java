/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.adapter;

/**
 *
 * @author aluno
 */
public class ClienteExemplo {
    Alvo[] alvos = new Alvo[2];
    
    public void inicializaAlvos(){
        Alvo alvoExistente = new Alvo() {
            @Override
            public void operacao(){
                ClasseExistente ce = new ClasseExistente();
                String texto = ce.metodoUtilDois("Classe existente");
                ce.metodoUtilUm(texto);
            }
        };
        
        alvos[0] = alvoExistente;
        alvos[1] = new Adaptador();
    }
    
    public void executarAlvo(){
        for(int i =0; i< alvos.length;i++){
            alvos[i].operacao();
        }
    }
    public static void main (String[] args){
        ClienteExemplo exemplo = new ClienteExemplo();
        exemplo.inicializaAlvos();
        exemplo.executarAlvo();
    }
}
