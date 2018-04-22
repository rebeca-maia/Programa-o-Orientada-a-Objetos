import java.util.Scanner;

public class Pessoa {
	public String nome;
	public String localizacao;
	public Chamado chamado;
	Scanner in = new Scanner(System.in); 
		
	public void exibir(Chamado chamado){
		System.out.println("O nome do Cliente: "+nome);
		System.out.println("localização do Cliente: "+localizacao);
		System.out.println("Status do Chamado: "+chamado.status);
		System.out.println("Descrição do Problema: "+chamado.descricao);
		System.out.println("Relatorio: "+chamado.solucao);
		System.out.println("Prioridade do Problema: "+chamado.prioridade);
		System.out.println("Protocolo: "+chamado.protocol);
		System.out.println("--------------------//---------------------");
	}
	public void cadastra (Chamado chamado){
		System.out.print("Digite o seu Nome: ");
		nome=in.nextLine();
		System.out.print("Digite a sua localizacao: ");
		localizacao=in.nextLine();
		System.out.print("Digite a Descrição do Problema: ");
		chamado.descricao=in.nextLine();
		System.out.print("Digite a Prioridade de 1 a 5. sendo 5 muito urgente e 1 pouco urgente: ");
		chamado.prioridade=in.nextInt();
		chamado.protocol=Historico.protocolo();
	}
	public Pessoa (String nome, String localizacao , Chamado chamado){
		
		this.nome=nome;
		this.localizacao=localizacao;
		this.chamado=chamado;
		
	}
	public String getNome() {
		return nome;
	
	}
	public void setNome(String nome) {
		nome=in.nextLine();
		this.nome = nome;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public Chamado getChamado() {
		return chamado;
	}
	public void setChamado(Chamado chamado) {
		this.chamado = chamado;
	}
	
}
