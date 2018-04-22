package SysPet;

public class Veterinario {
    private String nome;
    private int crmv;
    private String diasAtend;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome !=null){
            this.nome = nome;
        }
    }

    public int getCrmv() {
        return crmv;
    }

    public void setCrmv(int crmv) {
        if(crmv >0){
            this.crmv = crmv;
        }
    }

    public String getDiasAtend() {
        return diasAtend;
    }

    public void setDiasAtend(String diasAtend) {
        if(diasAtend != null){
            this.diasAtend = diasAtend;
        }
    }

    public Veterinario(){
        super();
    }
    
    public Veterinario(String nome, int crmv, String diasAtend) {
        this.nome = nome;
        this.crmv = crmv;
        this.diasAtend = diasAtend;
    }
    
  
 }





