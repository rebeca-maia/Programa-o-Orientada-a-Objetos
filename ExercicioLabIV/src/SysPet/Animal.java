package SysPet;

public abstract class Animal {
    private String nome;
    private int idade;
    
    public abstract void emitirSom();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome !=null){
            this.nome = nome;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade !=0){
            this.idade = idade;
        }
    }

    public Animal(){
        super();
    }
    public Animal(String nome, int idade) {
       this.nome = nome;
        this.idade = idade;
        
    }
    

}
