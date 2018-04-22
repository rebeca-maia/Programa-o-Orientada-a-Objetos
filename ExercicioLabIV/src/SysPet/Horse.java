package SysPet;

public class Horse extends Animal implements Corredor {

    public Horse() {
        super();
    }

    public Horse(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Relinchando");  
    }

    @Override
    public void correr() {
        System.out.println("O cavalo está correndo"); 
    }
   
    
}
