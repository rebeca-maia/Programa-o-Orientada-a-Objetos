
package Lab23ll06ll2016;


public class Gato extends Animal implements Corre, Sobe{
    
    @Override
   public String emitirSom(){
        String som = "miau";
        return som;
    }
    @Override
    public void correr(){
        System.out.println("Correndo");
    }
    
    @Override
    public String subir(){
        String acao = "subindo";
        return acao;
    }
    
    
    public Gato(String nome, int idade){
        super(nome, idade);
    }
    
}
