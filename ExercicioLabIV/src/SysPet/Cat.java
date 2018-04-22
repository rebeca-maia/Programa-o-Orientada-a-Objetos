package SysPet;

public class Cat extends Animal implements Escalador,Corredor{

    public Cat() {
        super();
    }

    public Cat(String nome, int idade) {
        super(nome, idade);
    }
     @Override
    public void emitirSom() {
         System.out.println("Miando");
    }

    @Override
    public void correr() {
        System.out.println("O gato está correndo");
    }
    
    @Override
    public void escalar(){
        System.out.println("O gato está subindo na árvore");
    }

}
