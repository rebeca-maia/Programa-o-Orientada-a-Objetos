
package Lab23ll06ll2016;

public class Preguica extends Animal implements Sobe{
    
     @Override
     public String emitirSom(){
        String som = "vuufiiii";
        return som;
    }
     @Override
    public String subir(){
        String acao = "subindo";
        return acao;
    }
    public Preguica(String nome, int idade){
        super(nome, idade);
    }
    
}
