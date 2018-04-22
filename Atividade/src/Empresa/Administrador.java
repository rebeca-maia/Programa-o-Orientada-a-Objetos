
package Empresa;

/**
 *
 * @author Rebeca
 */
public class Administrador extends Empregado {
    private float ajudaDeCusto;
    
    /**
     *
     * @return
     */
    @Override
    public float calcularSalarioLiquido(){
        return super.calcularSalarioLiquido() + ajudaDeCusto;
    }

    /**
     *
     * @param total
     */
    public void setAjudaDeCusto(float total){
        if(total >=0.0){
            this.ajudaDeCusto = total;
        }
    }

    /**
     *
     * @return
     */
    public float getAjudaDeCusto(){
        return ajudaDeCusto;
    }

    /**
     *
     */
    public Administrador(){
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
     * @param ajudaDeCusto
     */
    public Administrador(String nome, String endereço, int telefone, int codigoSetor,String nomeSetor, float salarioBase, float imposto, float ajudaDeCusto){
        super(nome, endereço, telefone, codigoSetor, nomeSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }
}

