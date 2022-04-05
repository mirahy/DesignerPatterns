package br.edu.ifms.congresso;

import java.util.ArrayList;
import java.util.List;
import static javax.management.Query.value;


public class Instituicao extends IndividuoCompnent{
    private List<IndividuoCompnent> membros = new ArrayList();

    public Instituicao(String nome) {
        super(nome);
    }
    
     @Override
    public int getAssento() {
        return membros.size();
    }
    
    public Instituicao add(IndividuoCompnent value){
        membros.add(value);
        return this;
    }
    
    public Instituicao remove(IndividuoCompnent value){
        membros.remove(value);
        return this;
    }

   public void setMembros(List<IndividuoCompnent> membros) {
        this.membros = membros;
    }

    public List<IndividuoCompnent> getMembros() {
        return membros;
    }
    
    
}
