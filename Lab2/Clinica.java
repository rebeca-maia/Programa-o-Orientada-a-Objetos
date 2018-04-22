
package Lab23ll06ll2016;

import java.util.ArrayList;

public class Clinica {
    protected String nomeCli;
    protected String endereco;
    protected String telefone;
    private Animal internacao [] = new Animal [1]; 
    private ArrayList <Animal> cadastroAnimal = new ArrayList <Animal> ();
    private Veterinario veterinarios [] = new Veterinario [4];

    
    
   
    public void addVeterinario(int crmv, String nome, String diasaten){
        for( int i =0; i < veterinarios.length; i++){
            if(veterinarios[i] != null){
                veterinarios [i] = new Veterinario(crmv, nome, diasaten);
            }
            if(i ==4){
                System.err.println("Nao temos vagas para veterinario");
            }
        }
    }
    public void demitirFunc(String nome){
        for(int i =0; i < veterinarios.length; i++){
            if(veterinarios[i].getNome() == nome){
                veterinarios[i] = null;
                System.out.println("Demitido com sucesso");
            }
        }
    }
    public void exibirVeterinario(){
        for(int i =0; i < veterinarios.length;i++){
            System.out.println("Nome:" +veterinarios[i].getNome());
            System.out.println("CRMV:" +veterinarios[i].getCrmv());
            System.out.println("==================================");
        }
    }
    public void exibirInternados(){
        for(int i =0; i < internacao.length;i++){
              
                if(internacao[i] instanceof Cachorro){
                    System.out.println("***Tipo do animal: Cachorro");
                    System.out.println(" nome:" + internacao[i].getNome());
                    System.out.println("Numero da jaula:" + i);
                    
                }
                if(internacao[i] instanceof Cavalo){
                    System.out.println("***Tipo do animal: Cavalo");
                    System.out.println(" nome:" + internacao[i].getNome());
                    System.out.println("Numero da jaula:" + i); 
                }
                if(internacao[i] instanceof Gato){
                    System.out.println("***Tipo do animal: Gato");
                    System.out.println(" nome:" + internacao[i].getNome());
                    System.out.println("Numero da jaula:" + i); 
                }
                if(internacao[i] instanceof Preguica){
                    System.out.println("***Tipo do animal: Preguica");
                    System.out.println(" nome:" + internacao[i].getNome());
                    System.out.println("Numero da jaula:" + i); 
               }
            
        }
    }    
    public void addInternacao(String tipo,String nome, int idade) {
        for(int i = 0; i < internacao.length; i++ ){
            if(this.internacao[i] == null){
                if(tipo == "Cachorro"){
                    
                        this.internacao [i] = new Cachorro(nome, idade);
                        System.out.println("Vaga encontradada, alocado na vaga" + "-" + i);
                     break;
                }
                if(tipo == "Cavalo"){
                    
                        this.internacao [i] = new Cavalo(nome, idade);
                        System.out.println("Vaga encontradada, alocado na vaga" + "-" + i);
                    break;
                }
                if(tipo == "Gato"){
                    
                        this.internacao [i] = new Gato(nome, idade);
                        System.out.println("Vaga encontradada, alocado na vaga" + "-" + i);
                    break;  
                }
                if(tipo == "Preguica"){
                   
                        this.internacao [i] = new Preguica(nome, idade);
                        System.out.println("Vaga encontradada, alocado na vaga" + "-" + i);
                    break;
                }
            }
            else{
               System.out.println("Sem vagas na clínica, para internacao"); 
            }
        }
        
        
    }
    
    public void barulho(){
        System.out.println("Animais fazendo barulho");
        for(int i = 0; i < internacao.length;i++){
            if(internacao[i] != null ){  
                if(internacao[i] instanceof Cachorro){
                    System.out.println("***Cachorro nome:" + internacao[i].getNome());
                    System.out.println("Barulho:" + internacao[i].emitirSom());
                }
                if(internacao[i] instanceof Cavalo){
                    System.out.println("***Cavalo nome:"+ internacao[i].getNome());
                    System.out.println("Barulho:" + internacao[i].emitirSom());
                }
                if(internacao[i] instanceof Gato){
                    System.out.println("***Gato nome:"+ internacao[i].getNome());
                    System.out.println("Barulho:" + internacao[i].emitirSom());
                    System.out.println("subindo na grade");
                }
                if(internacao[i] instanceof Preguica){
                    System.out.println("***Preguica nome:"+ internacao[i].getNome());
                    System.out.println("Barulho:" + internacao[i].emitirSom());
                    System.out.println("subindo na grade");
               }
            }    
        }
    } 
    
    public void cadastrar(String tipo, String nome, int idade){
        if(tipo != null && tipo =="Gato"){
            cadastroAnimal.add(new Gato(nome, idade));
            System.out.println("OK");
        }
        if(tipo != null && tipo =="Cachorro"){
            cadastroAnimal.add(new Cachorro(nome, idade));
            System.out.println("OK");
        }
        if(tipo != null && tipo =="Cavalo"){
            cadastroAnimal.add(new Cavalo(nome, idade));
            System.out.println("OK");
        }
        if(tipo != null && tipo =="Preguica"){
            cadastroAnimal.add(new Preguica(nome, idade));
            System.out.println("OK");
        }
    }
    public void alta(String nome){
        for(int i = 0; i < internacao.length; i++){
            if(internacao[i].getNome() == null ? nome == null : internacao[i].getNome().equals(nome)){
                System.out.println(nome + ": Recebeu alta");
                internacao[i] = null;
                break;
            }
            else{
                System.out.println(nome + ": Nao esta internado");
            }
        }
    }
    public void exibirCadastrados(){
        for (int i = 0; i < cadastroAnimal.size(); i++){
            
        }
    } 
    public String getNomeCli() {
        return nomeCli;
    }

    public void setNomeCli(String nomeCli) {
        if(nomeCli != null)
        this.nomeCli = nomeCli;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereço(String endereco) {
        if(endereco != null)
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if(telefone != null)
        this.telefone = telefone;
    }
    public void examinar(String tipo , String nome){
        for(int i=0; i < internacao.length;i++){
            if(tipo == "Cachorro" && internacao[i].getNome() == nome){    
                System.out.println("Examinando o :" + internacao[i].getNome());
                System.out.println(internacao[i].emitirSom());
            }
            if(tipo == "Cavalo" && internacao[i].getNome() == nome){    
                System.out.println("Examinando o :" + internacao[i].getNome());
                System.out.println(internacao[i].emitirSom());
            } 
            if(tipo == "Gato" && internacao[i].getNome() == nome){    
                System.out.println("Examinando o :" + internacao[i].getNome());
                System.out.println(internacao[i].emitirSom());
            } 
            if(tipo == "Preguica" && internacao[i].getNome() == nome){    
                System.out.println("Examinando o :" + internacao[i].getNome());
                System.out.println(internacao[i].emitirSom());
            } 
        }
    }
    
    
    public Clinica(String nome, String endereco, String telefone){
        this.nomeCli = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
     public Clinica(){
        
    }
    
    
}
