package Empresa;

/**
 *
 * @author Rebeca
 */
public class Empregado extends Pessoa {
    private int codigoSetor;
    private String nomeSetor;
    private float salarioBase;
    private float imposto;
  
    /**
     *
     * @return
     */
    public float calcularSalarioLiquido(){
       float  total;
        total = this.salarioBase - (this.salarioBase * (this.imposto / 100));
        return total;
    }
    
    /**
     *
     * @param codigoSetor
     */
    public void setCodigoSetor(int codigoSetor){
        if(codigoSetor >0){
            this.codigoSetor = codigoSetor;
        }
    
    }
    
    /**
     *
     * @return
     */
    public int getCodigoSetor(){
        return codigoSetor;
    }
    
    /**
     *
     * @param nomeSetor
     */
    public void setNomeSetor(String nomeSetor){
        if(nomeSetor != null){
            this.nomeSetor = nomeSetor;
        }
    }

    /**
     *
     * @return
     */
    public String getNomeSetor(){
        return nomeSetor;
    }
    
    /**
     *
     * @param salarioBase
     */
    public void setSalarioBase(float salarioBase){
        if(salarioBase > 0){
            this.salarioBase = salarioBase;
        }
    }

    /**
     *
     * @return
     */
    public double getSalarioBase(){
        return salarioBase;
    }

    /**
     *
     * @param imposto
     */
    public void setImposto(float imposto){
        if(imposto >=0){
            this.imposto = imposto;
        }
    } 
    
    /**
     *
     */
    public Empregado(){
        super();
    }

    /**
     *
     * @param nome
     * @param endereço
     * @param telefone
     * @param codigoSetor
     * @param nomeSetor
     * @param salarioBase
     * @param imposto
     */
    public Empregado(String nome, String endereço, int telefone, int codigoSetor,String nomeSetor, float salarioBase, float imposto ){
        super(nome, endereço, telefone);
        this.nomeSetor = nomeSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    /**
     *
     * @param nomeSetor
     * @param salarioBase
     * @param imposto
     */
    public Empregado(String nomeSetor, float salarioBase, float imposto ){
        
        this.nomeSetor = nomeSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    } 
    
}
   
  


