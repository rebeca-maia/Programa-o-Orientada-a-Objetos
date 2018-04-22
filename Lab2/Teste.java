package Lab23ll06ll2016;

import java.util.Scanner;
public class Teste {
    private static boolean estado;
   /*Completar MENU... falta case (6, 7 e 0);
    data da documentacao : 23/06/2016
    */
    private static String tipo;
    private static String nome;
    private static int idade;
    public static void main(String args []){
        Clinica a = new Clinica ("Confiança", "Rua dos Patos", "(yy) s xxxx - xxxx");
        Scanner s = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Teste c = new Teste();
        estado = true;
            while(estado == true){
                System.out.println("________Menu principal________");
                System.out.println("1- Cadastrar Animal ");
                System.out.println("2- Internar Animal");
                System.out.println("3- Dar Alta em Animal");
                System.out.println("4- Examinar Animal");
                System.out.println("5- Cadastrar Veterinário");
                System.out.println("6- Excluir Veterinário");
                System.out.println("7- Listar Veterinários");
                System.out.println("8- Listar Animais Internados");
                System.out.println("0- Encerrar");
                System.out.println("********************************");
                switch(s.nextInt()){
                    case 1:
                        
                          Teste.cadastrarAnimal();    
                        break;
                    case 2:
                          Teste.internar();
                        
                    break;
                    case 3:
                        Scanner s3 = new Scanner(System.in);
       
                        System.out.println("Nome:");
                        String nome4 = s3.nextLine();
        
        
                         a.alta(nome4);
                        break;
                    case 4:
                        Scanner s4 = new Scanner(System.in);
                        Scanner s5 = new Scanner(System.in);
                        System.out.println("Nome:");
                        String nome1 = s4.nextLine();
                        System.out.println("Tipo de animal, com a primeira letra maiuscula:");
                        String tipoj = s5.nextLine();
                        a.examinar(tipoj, nome1);
                        break;
                    case 5:
                        Scanner s7 = new Scanner(System.in);
                        Scanner s8 = new Scanner(System.in);
                        Scanner s9 = new Scanner(System.in);
                        System.out.println("Nome:");
                        String nome2 = s7.nextLine();
                        System.out.println("Digite o CRMV:");
                        int crmv = s8.nextInt();
                        System.out.println("Dias de atendimento:");
                        String da = s9.nextLine();
                        a.addVeterinario(crmv, nome2, da);
                        break;
                    case 8:
                         a.exibirInternados();
                        break;
                }
            }
                    
                
                
                
                
            }
    
    public static void cadastrarAnimal(){
        Scanner s2 = new Scanner(System.in);
            Clinica a = new Clinica();
                System.out.println("Qual tipo de animal ?:");
                        System.out.println("Cachorro;");
                        System.out.println("Gato; ");
                        System.out.println("Cavalo;");
                        System.out.println("Preguica;");
                        System.out.println("************");
                        System.out.println("Informe:");
                        
                        switch(s2.nextLine()){
                            case "Cachorro":
                                System.out.println("Nome:");
                                nome = s2.nextLine();
                                System.out.println("Idade:");
                                idade = s2.nextInt();
                                tipo = "Cachorro";
                                a.cadastrar(tipo, nome, idade);
                                break;
                            case "Gato":
                                System.out.println("Nome:");
                                nome = s2.nextLine();
                                System.out.println("Idade:");
                                idade = s2.nextInt();
                                tipo = "Gato";
                                a.cadastrar(tipo, nome, idade);
                                break;
                            case "Cavalo":
                                System.out.println("Nome:");
                                nome = s2.nextLine();
                                System.out.println("Idade:");
                                idade = s2.nextInt();
                                tipo = "Cavalo";
                                a.cadastrar(tipo, nome, idade);
                                break;
                            case "Preguica":
                                System.out.println("Nome:");
                                nome = s2.nextLine();
                                System.out.println("Idade:");
                                idade = s2.nextInt();
                                tipo = "Preguica";
                                a.cadastrar(tipo, nome, idade);
                                break;
                        }
    }
    
    public static void internar(){
        Scanner s2 = new Scanner(System.in);
        Clinica a = new Clinica();
        System.out.println("Qual tipo de animal ?:");
                        System.out.println("Cachorro;");
                        System.out.println("Gato; ");
                        System.out.println("Cavalo;");
                        System.out.println("Preguica;");
                        System.out.println("************");
                        System.out.println("terminar - Terminar cadastros");
                        System.out.println("Informe:");
                        
                        switch(s2.nextLine()){
                            case "Cachorro":
                                System.out.println("Nome:");
                                nome = s2.nextLine();
                                System.out.println("Idade:");
                                idade = s2.nextInt();
                                tipo = "Cachorro";
                                a.addInternacao(tipo, nome, idade);
                                break;
                            case "Cavalo":
                                System.out.println("Nome:");
                                nome = s2.nextLine();
                                System.out.println("Idade:");
                                idade = s2.nextInt();
                                tipo = "Cavalo";
                                a.addInternacao(tipo, nome, idade);
                                break; 
                            case "Gato":
                                System.out.println("Nome:");
                                nome = s2.nextLine();
                                System.out.println("Idade:");
                                idade = s2.nextInt();
                                tipo = "Gato";
                                a.addInternacao(tipo, nome, idade);
                                break;  
                            case "Preguica":
                                System.out.println("Nome:");
                                nome = s2.nextLine();
                                System.out.println("Idade:");
                                idade = s2.nextInt();
                                tipo = "Preguica";
                                a.addInternacao(tipo, nome, idade);
                                break;  
                            
                        }
        
    }
    public static void alta2(){
        
    }
    
    public static void exibirInternados(){
        Clinica a = new Clinica();
       
    }
                
                
                
        
          
    }
   


