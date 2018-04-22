
package Lab23ll06ll2016;

public class Veterinario {
    private int crmv;
    private String nome;
    private String diasAtendimento;
    

    public int getCrmv() {
        return crmv;
    }

    public void setCrmv(int crmv) {
        if(crmv > 0){
            this.crmv = crmv;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null){
            this.nome = nome;
        }
    }

    public String getDiasAtendimento() {
        return diasAtendimento;
    }

    public void setDiasAtendimento(String diasAtendimento) {
        if(diasAtendimento != null){
            this.diasAtendimento = diasAtendimento;
        }
    }
    
    public Veterinario(int crmv, String nome, String diasAten){
        this.crmv = crmv;
        this.nome = nome;
        this.diasAtendimento = diasAten;
    }
    
    
}
