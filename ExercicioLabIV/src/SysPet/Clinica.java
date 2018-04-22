package SysPet;

public class Clinica {
    private String razaoSocial;
    private String adress;
    private long telefone;
    Veterinario [] veterinarios = new Veterinario[4];
    Animal [] animaisInternados = new Animal [10];

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        if(razaoSocial != null){
            this.razaoSocial = razaoSocial;
        }
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        if(adress != null){
            this.adress = adress;
        }
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        if(telefone > 0){
            this.telefone = telefone;
        }
    }

    public Veterinario[] getVeterinarios() {
        return veterinarios;
    }

    public void setVeterinarios(Veterinario[] veterinarios) {
        this.veterinarios = veterinarios;
    }

    public Animal[] getAnimaisInternados() {
        return animaisInternados;
    }

    public void setAnimaisInternados(Animal[] animaisInternados) {
        this.animaisInternados = animaisInternados;
    }
    
}
