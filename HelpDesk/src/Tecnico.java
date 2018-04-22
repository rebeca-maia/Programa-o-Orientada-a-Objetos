
public class Tecnico extends Pessoa{
	public Tecnico(String nome, String localizacao, Chamado chamado) {
		super(nome, localizacao, chamado);
		
	}
	private String login;
	private String senha;
	public void cadastrar(){
		System.out.println("Digite o seu Nome: ");
		nome=in.nextLine();
		System.out.println("Digite o seu Login: ");
		login=in.next();
		System.out.println("Digite a sua Senha: ");
		senha=in.next();
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
