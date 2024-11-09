package gerenciadorEscola;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

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
		
		String codigoTurma; //VARIAVEIS TURMAS
		int anoLetivo; //VARIAVEIS TURMAS
		
		double valor; //VARIAVEIS NOTAS
		String data; //VARIAVEIS NOTAS
		
		//LISTAS
		ArrayList<Alunos> listaAlunos = new ArrayList<Alunos>();
		ArrayList<Professores> listaProfessores = new ArrayList<Professores>(); 
		ArrayList<Disciplinas> listaDisciplinas = new ArrayList<Disciplinas>();
		ArrayList<Turmas> listaTurmas = new ArrayList<Turmas>();
		ArrayList<Notas> listaNotas = new ArrayList<Notas>();
		
		
		
		while (menu != 15)
		{
			System.out.println("\n===============\n"
					+ "MENU PRINCIPAL\n"
					+ "===============\n");
			try
			{
				System.out.println("1- Cadastrar aluno\n"
						+ "2- Cadastrar professor\n"
						+ "3- Cadastrar disciplina\n"
						+ "4- Cadastrar turma\n"
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
					if (listaTurmas.isEmpty()) {
					    System.out.println("\nCadastre turmas antes!\n");
					}
					else {
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
					}
					break;
					
				case 2:
					
					if (listaDisciplinas.isEmpty()) {
					    System.out.println("\nCadastre as disciplinas antes!\n");
					}
					else {
						boolean sair_do_while2 = true;
						
						while (sair_do_while2 == true)
						{	
							try
							{
								scan.nextLine();
								System.out.println("\nCadastro de Professor:");
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
											
									System.out.println("\nAssocie uma disciplina cadastrada: [Digite o codigo]");
									
									for(Disciplinas auxiliar : listaDisciplinas) {
										System.out.println("Codigo: " + auxiliar.getCodigo() + " Nome: " + auxiliar.getNome());
							
									}
									
									int respostaProfessor = scan.nextInt();
									boolean encontrou = false;
									
									for(Disciplinas auxiliar : listaDisciplinas) {
										if(respostaProfessor == auxiliar.getCodigo()) {
											listaDisciplinasProfessores.add(auxiliar);
											encontrou = true;
											System.out.println("\nDisciplina associada com sucesso!");
										}
									}
									if(encontrou == false)
									{
										System.out.println("\nDigite uma disciplina valida!");
									}
									else
									{
										System.out.println("\nAssociar mais disciplinas? [1] - Sim / [2] - NAO");
										String respostaProfessor2 = scanString.nextLine();
										
										if(respostaProfessor2.trim().equals("2"))
										{
											sair_professor = false;
										}
									}
								}
								
								Professores objProfessor = new Professores(nome, dataNascimento, telefone, objEndereco, areaFormacao, anoAdmissao, email, listaDisciplinasProfessores);
								
								listaProfessores.add(objProfessor);
								
								sair_do_while2 = false;
							}
							
							catch (Exception ex2)
							{
								sair_do_while2 = true;
								System.out.println("\nErro ao gravar, tente novamente");
							}
						
						}
					}

					break;
					
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
					if (listaProfessores.isEmpty())
					{
						System.out.println("\nCadastre os professores antes!");
					}
					else
					{
						Professores professorTurma = new Professores();
						Disciplinas disciplinaTurma = new Disciplinas();
						boolean sair_do_while4 = true;
						while (sair_do_while4 == true)
						{	
							try
							{
								System.out.println("\nCadastro de Turmas:");
								System.out.println("\nCodigo:");
								codigoTurma = scanString.nextLine();
								System.out.println("\nAno Letivo:");
								anoLetivo = scan.nextInt();
								boolean sair_turma1 = true;
								boolean sair_turma2 = true;
								
								while(sair_turma1 == true)
								{
									System.out.println("\nAssocie a disciplina: [Digite o codigo]");
									
									for(Disciplinas auxiliar : listaDisciplinas)
									{
										System.out.println("Codigo: " + auxiliar.getCodigo() + " Nome: " + auxiliar.getNome());
									}
					
									int respostaTurma = scan.nextInt();
									boolean encontrou = false;
									
									for(Disciplinas auxiliar : listaDisciplinas) {
										if(respostaTurma == auxiliar.getCodigo()) {
											disciplinaTurma = auxiliar; 
											encontrou = true;
											System.out.println("\nDisciplina associada com sucesso!");
										}
									}
									if(encontrou == false)
									{
										System.out.println("\nDigite uma disciplina valida!");
									}
									else
									{
										sair_turma1 = false;
									}
								}
								
								while(sair_turma2 == true)
								{
									System.out.println("\nAssocie a professor: [Digite o nome]");
									
									for(Professores auxiliar : listaProfessores)
									{
										System.out.println("Nome: " + auxiliar.getNome());
									}
					
									String respostaTurma2 = scanString.nextLine();
									boolean encontrou = false;
									
									for(Professores auxiliar : listaProfessores) {
										if(respostaTurma2.equals(auxiliar.getNome())) {
											professorTurma = auxiliar; 
											encontrou = true;
											System.out.println("\nProfessor associado com sucesso!");
										}
										
									}
									if(encontrou == false)
									{
										System.out.println("\nDigite um professor valido!");
									}
									else
									{
										sair_turma2 = false;
									}
								}
								
								Turmas objTurma = new Turmas(codigoTurma,disciplinaTurma, professorTurma,anoLetivo);
								listaTurmas.add(objTurma);
								
							sair_do_while4 = false;
							}
							catch (Exception ex4)
							{
								sair_do_while4 = true;
								System.out.println("\nErro ao gravar, tente novamente");
							}
						}
					}
					break;
					
				case 5:
					if (listaAlunos.isEmpty()){
						System.out.println("\nCadastre alunos antes!");
					}	
					else
					{
						Alunos alunoNota = new Alunos();
						Disciplinas disciplinaNota = new Disciplinas();
						boolean sair_do_while5 = true;
						while (sair_do_while5 == true)
						{	
							try
							{
								System.out.println("\nInsercao de Notas:");
								System.out.println("\nValor da nota:");
								valor = scan.nextDouble();
								System.out.println("\nData:");
								data = scanString.nextLine();
								
								boolean sair_nota1 = true;
								boolean sair_nota2 = true;
								
								while(sair_nota1 == true)
								{
									System.out.println("\nAssocie um Aluno: [Digite a matricula]");
									
									for(Alunos auxiliar : listaAlunos)
									{
										System.out.println("Matricula: " + auxiliar.getMatricula() + " Nome: " + auxiliar.getNome());
									}
					
									int respostaNota = scan.nextInt();
									boolean encontrou = false;
									
									for(Alunos auxiliar : listaAlunos) {
										if(respostaNota == auxiliar.getMatricula()) {
											alunoNota = auxiliar; 
											encontrou = true;
											System.out.println("\nAssociado ao aluno com sucesso!");
										}
									}
									if(encontrou == false)
									{
										System.out.println("\nDigite uma matricula valida!");
									}
									else
									{
										sair_nota1 = false;
									}
								}
								
								while(sair_nota2 == true)
								{
									System.out.println("\nAssocie a disciplina: [Digite o codigo]");
									
									for(Disciplinas auxiliar : listaDisciplinas)
									{
										System.out.println("Codigo: " + auxiliar.getCodigo() + " Nome: " + auxiliar.getNome());
									}
					
									int respostaNota2 = scan.nextInt();
									boolean encontrou = false;
									
									for(Disciplinas auxiliar : listaDisciplinas) {
										if(respostaNota2 == auxiliar.getCodigo()) {
											disciplinaNota = auxiliar; 
											encontrou = true;
											System.out.println("\nDisciplina associada com sucesso!");
										}
										
									}
									if(encontrou == false)
									{
										System.out.println("\nDigite uma disciplina valida!");
									}
									else
									{
										sair_nota2 = false;
									}
								}
								
								Notas objNota = new Notas(valor,data,alunoNota,disciplinaNota);
								listaNotas.add(objNota);
								
								System.out.println("\n" + objNota.getValor() + "\n" + objNota.getData() + "\n" + objNota.getAluno().getNome() + "\n" + objNota.getDisciplina().getNome());
								
								sair_do_while5 = false;
							}
							catch(Exception ex5)
							{
								sair_do_while5 = true;
								System.out.println("\nErro ao gravar, tente novamente");
							}
						}
					
					}
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
