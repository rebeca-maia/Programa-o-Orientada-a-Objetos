
package Lab23ll06ll2016;

public class Cavalo extends Animal implements Corre{
    
    @Override
    public String emitirSom(){
        String som = "chrichicrrich";
        return som;
    }
     
    @Override
    public void correr(){
        System.out.println("Correndo");
    }
    
    public Cavalo(String nome, int idade){
        super(nome, idade);
    }
    
}
