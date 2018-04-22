
package Lab23ll06ll2016;

public class Cachorro extends Animal implements Corre{
    
     @Override
    public String emitirSom(){
        String som = "au";
        return som;
    }
    
    @Override
    public void correr(){
        System.out.println("Correndo");
    }
    

    public Cachorro(String nome, int idade){
        super(nome, idade);
    }
    
}
