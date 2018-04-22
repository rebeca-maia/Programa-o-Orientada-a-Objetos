package Empresa;

import java.util.ArrayList;

/**
 *
 * @author Rebeca
 */
public class Operario extends Empregado{
    
    float valorDeProducao;
    float comissao;
    ArrayList <String> historicoMensal = new ArrayList <> ();
    
    /**
     *
     * @param valorDeProducao
     */
    public void setValorDeProducao(float valorDeProducao){
        if(valorDeProducao > 0.0){
            this.valorDeProducao= valorDeProducao;
        }
    }
    
    /**
     *
     * @return
     */
    public float getValorDeProducao(){
        return valorDeProducao;
    }
    
    /**
     *
     * @param comissao
     */
    public void setComissao(float comissao){
        if(comissao >= 0){
            this.comissao = comissao;
        }
    }    
    
    /**
     *
     * @return
     */
    public float getComissao(){
        return comissao;
    }

    /**
     *
     * @param historicoMensal
     */
    public void setHistoricoMensal(ArrayList historicoMensal){
        if(historicoMensal != null){
            historicoMensal.add(historicoMensal);
        }
    }

    /**
     *
     * @return
     */
    public ArrayList getHistoricoMensal(){
        return historicoMensal;

    }
}
    
    
    
    
    
    
