import java.util.ArrayList;
import java.util.Scanner;
public class Menu {
	static ArrayList<Pessoa> arrayPessoa = new ArrayList<>(); 
	static ArrayList<Chamado> arrayChamado=new ArrayList<>();
	public static void main (String args[]){
		Pessoa pessoa1 =new Pessoa(null, null, null);
		pessoa1.nome="Raphael";
		pessoa1.localizacao="bloco c";
		Chamado chamado1=new Chamado();
		chamado1.descricao="meu pc estava desligando";
		chamado1.prioridade=3;
		chamado1.protocol=Historico.protocolo();
		Pessoa pessoa2=new Pessoa(null, null, null);
		pessoa2.nome="Rebeca";
		pessoa2.localizacao="bloco D";
		Chamado chamado2=new Chamado();
		chamado2.descricao="computador sem acesso a internet ";
		chamado2.prioridade=4;
		chamado2.protocol=Historico.protocolo();		
		arrayPessoa.add(pessoa1);
		arrayChamado.add(chamado1);
		arrayPessoa.add(pessoa2);
		arrayChamado.add(chamado2);
	Scanner in = new Scanner(System.in);
	Scanner tr = new Scanner(System.in);
	int x;
	int y;
	String id;
	String[] idd=new String[10];
	String senhaux;
	idd[3]="nome";

	ArrayList<String> arrayTecnico=new ArrayList<>();
	ArrayList<String> arraySenha=new ArrayList<>();
	
	while(true){
	System.out.println("digite 1 para Cliente e 2 para Tecnico.");
	x=in.nextInt();
	switch (x){
	case 1:
		do{
			System.out.println("Digite 1 Para: Abrir chamado.");
			System.out.println("Digite 2 Para: Busca Chamado.");
			System.out.println("Digite 3 Para: Volta.");
			x=in.nextInt();
			
		switch (x){
		case 1:
			Pessoa a = new Pessoa(null, null, null);
			Chamado b= new Chamado();
			a.cadastra(b);
			arrayChamado.add(b);
			arrayPessoa.add(a);
			System.out.println("O numero do seu protocolo é: "+b.protocol);
			break;
		case 2:
			System.out.println("Digite o Numero Do Protocolo: ");
			x=in.nextInt();
			buscador(x);
			break;
		default:
			System.out.println("Essa opção não e valida");
		}
		}while(x!=3);
		break;
	case 2:
		do{
			System.out.println("Digite 1 para: login");
			System.out.println("Digite 2 para: Cadastrar Tecnico");
			System.out.println("Digite 3 para: Volta");
			x=in.nextInt();
			
			switch(x){
			case 1:
				System.out.println("Digite o Seu Login: ");
				id=in.next();
				System.out.println("Digite a Sua Senha: ");
				senhaux=in.next();
				for (int i=0;i<arrayTecnico.size();i++) {
				if(id.equals(arrayTecnico.get(i))){
						if(senhaux.equals(arraySenha.get(i))){
							System.out.println("Sua Senha Esta correta ");
							do{
								System.out.println("Digite 1 para: Ver Chamados");
								System.out.println("Digite 2 para: Editar Status Do Chamado");
								System.out.println("Digite 3 para: Volta");
								x=in.nextInt();
								switch(x){
								case 1:
									listar();
									break;
								case 2:
									System.out.println("digite o Protocolo");
									x=in.nextInt();
									System.out.println("Digite 1 Para Status Aberto e 2 para Status Fechado, do Chamado: ");
									y=in.nextInt();
									switch(y){
									case 1:
									arrayChamado.get(x-1).status=("Aberto");
									break;
									case 2:
										arrayChamado.get(x-1).status=("Fechado");
									break;
									default:
										
									}
									System.out.println("Digite o Relatorio:  ");
									arrayChamado.get(x-1).solucao=tr.nextLine();
									break;
								default:
									System.out.println("Essa opção não e valida");
									}
							}while(x!=3);
						}
					}
				}
				break;
			case 2:
				Tecnico a= new Tecnico(null, null, null);
				a.cadastrar();
				arrayTecnico.add(a.getLogin());
				arraySenha.add(a.getSenha());
				break;
			default:
				System.out.println("Essa opção não e valida");
			}
		}while(x!=3);
	default:
		System.out.println("Essa opção não e valida");
	}
	
	}
	
	
}
	
	private static void listar() {
		for(int k=0;k<arrayPessoa.size();k++){
			arrayPessoa.get(k).exibir(arrayChamado.get(k));
			}
	}
	private static void buscador (int a){
		arrayPessoa.get(a-1).exibir(arrayChamado.get(a-1));
		}
	}
		
	

