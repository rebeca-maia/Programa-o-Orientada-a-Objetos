package SysPet;

public class Dog extends Animal implements Corredor{

    public Dog(){
        super();
    }
    
    public Dog(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Latindo");
        }

    @Override
    public void correr() {
        System.out.println("O cachorro está correndo");
    }
    
}
