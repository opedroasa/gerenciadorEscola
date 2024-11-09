package gerenciadorEscola;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Scanner scanString = new Scanner(System.in);
		int menu=0;
		
		String nome,dataNascimento,telefone; //VARIAVEIS PESSOAS
		
		String cidade,bairro,rua; //VARIAVEIS ENDERECOS
		int numero; //VARIAVEIS ENDERECOS
		
		int matricula,anoIngresso; //VARIAVEIS ALUNOS
		
		String areaFormacao, email; //VARIAVEIS PROFESSORES
		int anoAdmissao; //VARIAVEIS PROFESSORES
		
		String nomeDisciplina; //VARIAVEIS DISCIPLINAS
		int cargaHoraria, codigo; //VARIAVEIS DISCIPLINAS
		

		
		//LISTAS
		ArrayList<Alunos> listaAlunos = new ArrayList<Alunos>();
		ArrayList<Professores> listaProfessores = new ArrayList<Professores>(); 
		ArrayList<Disciplinas> listaDisciplinas = new ArrayList<Disciplinas>(); 
		
		
		
		while (menu != 15)
		{
			System.out.println("===============\n"
					+ "MENU PRINCIPAL\n"
					+ "===============");
			try
			{
				System.out.println("1- Cadastrar aluno\n"
						+ "2- Cadastrar professor\n"
						+ "3- Cadastrar disciplina\n"
						+ "4- Cadastrar Turma\n"
						+ "5- Inserir nota\n"
						+ "6- Relatorio alunos\n"
						+ "7- Relatorio professores\n"
						+ "8- Relatorio disciplinas\n"
						+ "9- Relatorio turmas\n"
						+ "10- Relatorio de aluno X notas X medias\n"
						+ "11- Quantidade de alunos cadastrados\n"
						+ "12- Nome do aluno de uma determinada disciplinas\n"
						+ "13- Listar os alunos de uma determinada disciplina\n"
						+ "14- Listar as turmas que estao associadas a um determinado professor\n"
						+ "15- Sair");
				
				menu = scan.nextInt();
				
				switch(menu)
				{
				
				case 1:	
					boolean sair_do_while1 = true;
					while (sair_do_while1 == true)
					{	
						try
						{
							scan.nextLine();
							System.out.println("\nCadastro de Aluno:");
							System.out.println("\nNome:");
							nome = scanString.nextLine(); 
							System.out.println("\nData de nascimento:");
							dataNascimento = scanString.nextLine();
							System.out.println("\nTelefone:");
							telefone = scanString.nextLine();
							System.out.println("\nCidade:");
							cidade = scanString.nextLine();
							System.out.println("\nBairro:");
							bairro = scanString.nextLine();
							System.out.println("\nRua:");
							rua = scanString.nextLine();
							System.out.println("\nNumero:");
							numero = scan.nextInt();
							Enderecos objEndereco = new Enderecos(cidade,bairro,rua,numero);
							System.out.println("\nMatricula:");
							matricula = scan.nextInt();
							System.out.println("\nAno Ingresso:");
							anoIngresso = scan.nextInt();
							Alunos objAluno = new Alunos(nome,dataNascimento,telefone,objEndereco,matricula,anoIngresso);
							listaAlunos.add(objAluno);
							
							sair_do_while1 = false;
						}
						
						catch (Exception ex2)
						{
							sair_do_while1 = true;
							System.out.println("\nErro ao gravar, tente novamente");
						}
					}
						
					
					break;
					
				case 2:
					
					boolean sair_do_while2 = true;
					
					while (sair_do_while2 == true)
					{	
						try
						{
							scan.nextLine();
							System.out.println("\nNome:");
							nome = scanString.nextLine(); 
							System.out.println("\nData de nascimento:");
							dataNascimento = scanString.nextLine();
							System.out.println("\nTelefone:");
							telefone = scanString.nextLine();
							System.out.println("\nCidade:");
							cidade = scanString.nextLine();
							System.out.println("\nBairro:");
							bairro = scanString.nextLine();
							System.out.println("\nRua:");
							rua = scanString.nextLine();
							System.out.println("\nNumero:");
							numero = scan.nextInt();
							Enderecos objEndereco = new Enderecos(cidade,bairro,rua,numero);
							System.out.println("\nArea Formacao:");
							areaFormacao = scanString.nextLine();
							System.out.println("\nAno Admissao:");
							anoAdmissao  = scan.nextInt();
							System.out.println("\nEmail:");
							email = scanString.nextLine();
							ArrayList<Disciplinas> listaDisciplinasProfessores = new ArrayList<Disciplinas>(); 
							
							boolean sair_professor = true;
							
							while(sair_professor == true) {
										
								System.out.println("\nAssocie uma disciplina cadastrada:");
								
								for(Disciplinas auxiliar : listaDisciplinas) {
									System.out.println("Codigo " + auxiliar.getCodigo() + " Nome " + auxiliar.getNome());
						
								}
								
								int respostaProfessor = scan.nextInt();
								
								for(Disciplinas auxiliar : listaDisciplinas) {
									if(respostaProfessor == auxiliar.getCodigo()) {
										listaDisciplinasProfessores.add(auxiliar);
									}
						
								}
								
								sair_professor = false;
								
							}
							
							Professores objProfessor = new Professores(nome, dataNascimento, telefone, objEndereco, areaFormacao, anoAdmissao, email, listaDisciplinasProfessores);
							
							listaProfessores.add(objProfessor);
							
							
							//apagar depois
							for(Professores auxiliar : listaProfessores) {
								System.out.println("Nome Professor " + auxiliar.getNome());
								for(Disciplinas auxiliar2 : auxiliar.getDisciplinas()) {
									System.out.println("Nome da disciplina do professor " + auxiliar2.getNome());
								}
							}
							//apagar antes
							
							sair_do_while2 = false;
						}
						
						catch (Exception ex2)
						{
							sair_do_while2 = true;
							System.out.println("\nErro ao gravar, tente novamente");
						}
						
						break;
					
					}
					
				case 3:
					
					boolean sair_do_while3 = true;
					
					while (sair_do_while3 == true)
					{	
						try
						{
							scan.nextLine();
							System.out.println("\nCadastro de Disciplina:");
							System.out.println("\nNome Disciplina:");
							nomeDisciplina = scanString.nextLine();
							System.out.println("\nCarga Horaria:");
							cargaHoraria = scan.nextInt();
							System.out.println("\nCodigo:");
							codigo = scan.nextInt();
							Disciplinas objDisciplina = new Disciplinas(nomeDisciplina, cargaHoraria, codigo);
							listaDisciplinas.add(objDisciplina);
							
							sair_do_while3 = false;
						}
						
						catch (Exception ex3)
						{
							sair_do_while3 = true;
							System.out.println("\nErro ao gravar, tente novamente");
						}
					}
					break;
					
				case 4:
					
					System.out.println("\n4\n");
					break;
					
				case 5:
					
					System.out.println("\n5\n");
					break;
					
				case 6:
					
					System.out.println("\n6\n");
					break;
					
				case 7:
					
					System.out.println("\n7\n");
					break;
					
				case 8:
					
					System.out.println("\n8\n");
					break;
					
				case 9:
					
					System.out.println("\n9\n");
					break;
					
				case 10:
					
					System.out.println("\n10\n");
					break;
					
				case 11:
					
					System.out.println("\n11\n");
					break;
					
				case 12:
					
					System.out.println("\n12\n");
					break;
					
				case 13:
					
					System.out.println("\n13\n");
					break;
					
				case 14:
					
					System.out.println("\n14\n");
					break;
					
				case 15:
					
					System.out.println("\nObrigado!\n");
					break;
					
				default:
					
					System.out.println("\nDigite uma opcao valida!\n");
				}
				
			}
			
			catch (Exception ex1)
			{
				System.out.println("\nDigite uma opcao valida!\n");
				scan.nextLine();
			}
		}

	}

}
