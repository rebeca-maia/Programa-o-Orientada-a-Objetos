
package Empresa;

/**
 *
 * @author Rebeca
 */
public class Fornecedor extends Pessoa {
    
    private float valorCredito;
    private float valorDivida;
   
    /**
     *
     * @param valorCredito
     */
    public void setValorCredito(float valorCredito){
        
       this.valorCredito = valorCredito;
    }

    /**
     *
     * @return
     */
    public float getValorCredito(){
        
        return valorCredito;
    }
    
    /**
     *
     * @param valorDivida
     */
    public void setValorDivida(float valorDivida){
        if(valorDivida >= 0){
            this.valorDivida = valorDivida;
        }
    }
    
    /**
     *
     * @return
     */
    public float getValorDivida(){
        return valorDivida;
    }

    /**
     *
     * @return
     */
    public float saldo(){
        return this.valorCredito - this.valorDivida;
    }
    
    /**
     *
     */
    public Fornecedor(){
        super();
    }

    /**
     *
     * @param nome
     * @param endereço
     * @param telefone
     * @param valorCredito
     * @param valorDivida
     */
    public Fornecedor(String nome, String endereço, int telefone,float valorCredito, float valorDivida){
        super(nome, endereço, telefone);
        this.valorDivida = valorDivida;
        this.valorCredito = valorCredito;
                
    }
    
    }


