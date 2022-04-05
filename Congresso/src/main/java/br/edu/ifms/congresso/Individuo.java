
package br.edu.ifms.congresso;


public class Individuo extends IndividuoCompnent{
    
    public Individuo(String nome){
        super(nome);
    }

    @Override
    public int getAssento() {
        return 1;
    }
    
    
}
