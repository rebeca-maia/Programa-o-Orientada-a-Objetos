
package Empresa;

/**
 *
 * @author Rebeca
 */
public class Pessoa {
    private String nome;
    private String endereço;
    private int telefone;
    
    /**
     *
     * @param nome
     */
    public void setNome(String nome){
        if(nome != null){
            this.nome = nome;
        }
    }
    
    /**
     *
     * @return
     */
    public String getNome(){
        return nome;
    }
    
    /**
     *
     * @param endereço
     */
    public void setEndereco(String endereço){
        if(endereço != null){
            this.endereço = endereço;
        }
    }

    /**
     *
     * @return
     */
    public String getEndereço(){
        return endereço;
    }
    
    /**
     *
     * @param telefone
     */
    public void setTelefone(int telefone){
        if(telefone >= 0){
            this.telefone = telefone;
        }
    }

    /**
     *
     * @return
     */
    public int getTelefone(){
        return telefone;
    }
    
    /**
     *
     */
    public Pessoa(){
        super();
    }
    
    /**
     *
     * @param nome
     * @param endereço
     * @param telefone
     */
    public Pessoa(String nome, String endereço, int telefone){
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
    }
    
}
