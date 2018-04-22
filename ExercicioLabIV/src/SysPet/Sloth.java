package SysPet;

public class Sloth extends Animal implements Escalador{

    public Sloth() {
        super();
    }

    public Sloth(String nome, int idade) {
        super(nome, idade);
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Fazendo o barulho que o bicho-preguiça faz");
    }
    @Override
    public void escalar() {
        System.out.println("A preguiça está subindo na árvore"); 
    }
}
