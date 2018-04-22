
package Lab23ll06ll2016;

public abstract class Animal  {
    protected String nome;
    protected int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null){
            this.nome = nome;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade > 0){
            this.idade = idade;
        }
    }
    
    public abstract String emitirSom();
   
    public Animal(String nome, int idade){
        this.idade = idade;
        this.nome = nome;
    }
}
