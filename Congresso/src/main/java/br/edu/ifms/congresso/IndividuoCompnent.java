package br.edu.ifms.congresso;

 public abstract class IndividuoCompnent {
    private String nome;
     
     public abstract int getAssento();

 

    public IndividuoCompnent(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
     
     
    
}
