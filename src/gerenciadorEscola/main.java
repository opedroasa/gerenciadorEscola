package gerenciadorEscola;
import java.util.*;
import java.io.*;

public class main {

	public static void main(String[] args) {
		
		FileWriter arquivoAlunos = null, arquivoDisciplinas = null, arquivoEnderecos = null,
				arquivoNotas = null, arquivoProfessores = null, arquivoTurmas = null; //VARIAVEIS TXT
		File caminhoAlunos = new File("alunos.txt");
		File caminhoDisciplinas = new File("disciplinas.txt");
		File caminhoEnderecos = new File("enderecos.txt");
		File caminhoNotas = new File("notas.txt");
		File caminhoProfessores = new File("professores.txt");
		File caminhoTurmas = new File("turmas.txt");
		
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
		ArrayList<String> textoArquivo = new ArrayList<String>();
		
		//INICIO RECUPERAÇÃO DE DADOS DOS ARQUIVOS TXT
		if(caminhoDisciplinas.exists())
		{
			 try  {
				 Scanner leituraDisciplinas = new Scanner(caminhoDisciplinas);
				 String nomeDisciplina2 = "";
				 int cargaHoraria2,codigo2;
				 
				 while(leituraDisciplinas.hasNextLine())
				 {
					 nomeDisciplina2 = leituraDisciplinas.nextLine();
					 cargaHoraria2 = Integer.parseInt(leituraDisciplinas.nextLine());
					 codigo2 = Integer.parseInt(leituraDisciplinas.nextLine());
					 
					 Disciplinas disciplina2 = new Disciplinas(nomeDisciplina2,cargaHoraria2,codigo2);
					 listaDisciplinas.add(disciplina2);
				 }
						 
			}
			catch (Exception ex0_1)
			{
				System.out.println("Erro ao carregar o banco de dados, por favor verifique disciplinas.txt!");
			}
		}
		
		if(caminhoProfessores.exists())
		{
			 try  {
				 Scanner leituraProfessores = new Scanner(caminhoProfessores);
				 String nomeProfessor2 = "", dataNascimento2 = "", cidade2 = "", bairro2 ="", rua2 = "",areaFormacao2 = "",email2 = "",nomeDisciplina2 = "",telefone2 = "";
				 int numero2,anoAdmissao2,cargaHoraria2,codigo2;
				 
				 while(leituraProfessores.hasNextLine())
				 {
					 
					 nomeProfessor2 = leituraProfessores.nextLine();
					 dataNascimento2 = leituraProfessores.nextLine();
					 telefone2 = leituraProfessores.nextLine();
					 cidade2 = leituraProfessores.nextLine();
					 bairro2 = leituraProfessores.nextLine();					 
					 rua2 = leituraProfessores.nextLine();					 
					 numero2 = Integer.parseInt(leituraProfessores.nextLine());					 
					 areaFormacao2 = leituraProfessores.nextLine();					 
					 anoAdmissao2 = Integer.parseInt(leituraProfessores.nextLine());					 
					 email2 = leituraProfessores.nextLine();					 
					 Enderecos endereco2 = new Enderecos(cidade2,bairro2,rua2,numero2);					 
					 nomeDisciplina2 = leituraProfessores.nextLine();					 
					 cargaHoraria2 = Integer.parseInt(leituraProfessores.nextLine());					 
					 codigo2 = Integer.parseInt(leituraProfessores.nextLine());					 
					 Disciplinas disciplina2 = new Disciplinas(nomeDisciplina2,cargaHoraria2,codigo2);					 
					 ArrayList<Disciplinas> listaDisciplinas2 = new ArrayList<Disciplinas>();					 
					 listaDisciplinas2.add(disciplina2);					 
					 Professores professor2 = new Professores(nomeProfessor2, dataNascimento2, telefone2, endereco2, areaFormacao2, anoAdmissao2, email2,listaDisciplinas2);
					 listaProfessores.add(professor2);
				 }
						 
			}
			catch (Exception ex0_2)
			{
				System.out.println("Erro ao carregar o banco de dados, por favor verifique professores.txt!");
			}
		}
		
		if(caminhoTurmas.exists())
		{
			try  {
				 Scanner leituraTurmas = new Scanner(caminhoTurmas);
				 String codigo2 = "", nomeDisciplina3 = "",nomeProfessor3 = "";
				 int anoLetivo2;
				 
				 while(leituraTurmas.hasNextLine())
				 {
					 codigo2 = leituraTurmas.nextLine();
					 nomeDisciplina3 = leituraTurmas.nextLine();
					 nomeProfessor3 = leituraTurmas.nextLine();
					 anoLetivo2 = Integer.parseInt(leituraTurmas.nextLine());
					 Disciplinas disciplina3 = new Disciplinas();
					 Professores professor3 = new Professores();
					 
					 for(Disciplinas aux1 : listaDisciplinas)
					 {
						 if(nomeDisciplina3.equals(aux1.getNome()))
						 {
							 disciplina3 = aux1;
						 }
					 }
					 
					 for(Professores aux2 : listaProfessores)
					 {
						 if(nomeProfessor3.equals(aux2.getNome()))
						 {
							 professor3 = aux2;
						 }
					 }
					 	Turmas turma2 = new Turmas(codigo2,disciplina3, professor3,anoLetivo2);
						listaTurmas.add(turma2);

				 }
						 
			}
			catch (Exception ex0_3)
			{
				System.out.println("Erro ao carregar o banco de dados, por favor verifique turmas.txt!");
			}
		}
		
		if(caminhoAlunos.exists())
		{
			try  {
				 Scanner leituraAlunos = new Scanner(caminhoAlunos);
				 String nomeAluno2 = "", dataNascimento3 = "", cidade3 = "", bairro3 ="", rua3 = "",areaFormacao3 = "",email3 = "",nomeDisciplina3 = "",telefone3 = "", codigoTurma2 = "";
				 int numero3,matricula2,anoIngresso2;
				 
				 while(leituraAlunos.hasNextLine())
				 {
					 nomeAluno2 = leituraAlunos.nextLine();
					 dataNascimento3 = leituraAlunos.nextLine();
					 telefone3 = leituraAlunos.nextLine();
					 cidade3 = leituraAlunos.nextLine();
					 bairro3 = leituraAlunos.nextLine();
					 rua3 = leituraAlunos.nextLine();
					 numero3 = Integer.parseInt(leituraAlunos.nextLine());
					 matricula2 = Integer.parseInt(leituraAlunos.nextLine());
					 anoIngresso2 = Integer.parseInt(leituraAlunos.nextLine());
					 codigoTurma2 = leituraAlunos.nextLine();
					 Turmas turma3 = new Turmas();
					 for(Turmas aux1 : listaTurmas)
					 {
						 if(codigoTurma2.equals(aux1.getCodigo()))
						 {
							 turma3 = aux1;
						 }
					 }
					 Enderecos endereco3 = new Enderecos(cidade3,bairro3,rua3,numero3);
					 Alunos aluno2 = new Alunos(nomeAluno2,dataNascimento3,telefone3,endereco3,matricula2,anoIngresso2);
					 aluno2.addTurma(turma3);
					 listaAlunos.add(aluno2);

				 }
						 
			}
			catch (Exception ex0_4)
			{
				System.out.println("Erro ao carregar o banco de dados, por favor verifique alunos.txt!");
			}
		}
		
		if(caminhoNotas.exists())
		{
			try  {
				 Scanner leituraNotas = new Scanner(caminhoNotas);
				 Double valor2;
				 String data3 = "", nomeAluno3 = "", nomeDisciplina4 = "";
				 
				 while(leituraNotas.hasNextLine())
				 {
					 valor2 = Double.parseDouble(leituraNotas.nextLine());
					 data3 = leituraNotas.nextLine();
					 nomeAluno3 = leituraNotas.nextLine();
					 nomeDisciplina4 = leituraNotas.nextLine();
					 Alunos aluno3 = new Alunos();
					 Disciplinas disciplina4 = new Disciplinas();
					 
					 for(Alunos aux1 : listaAlunos)
					 {
						 if(nomeAluno3.equals(aux1.getNome()))
						 {
							 aluno3 = aux1;
						 }
					 }
					 
					 for(Disciplinas aux2 : listaDisciplinas)
					 {
						 if(nomeDisciplina4.equals(aux2.getNome()))
						 {
							 disciplina4 = aux2;
						 }
					 }

					 	Notas nota2 = new Notas(valor2,data3, aluno3,disciplina4);
						listaNotas.add(nota2);

				 }
						 
			}
			catch (Exception ex0_4)
			{
				System.out.println("Erro ao carregar o banco de dados, por favor verifique notas.txt!");
			}
		}
		

		for(Alunos turmasAlunos : listaAlunos)
		{
			String codturma = turmasAlunos.getTurma().getCodigo();
			for(Turmas aux1 : listaTurmas)
			 {
				 if(codturma.equals(aux1.getCodigo()))
				 {
					 aux1.addAluno(turmasAlunos);
				 }
			 }
		}
		//FIM RECUPERAÇÃO DE DADOS DOS ARQUIVOS TXT
		
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
						+ "12- Nome do aluno com maior nota\n"
						+ "13- Listar os alunos de uma determinada disciplina\n"
						+ "14- Listar as turmas que estao associadas a um determinado professor\n"
						+ "15- Sair");
				
				menu = scan.nextInt();
				
				switch(menu)
				{
				
				case 1:	
					if (listaTurmas.isEmpty()) {
					    System.out.println("\nCadastre turmas antes!");
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
								
								boolean sair_aluno = true;
								
								while(sair_aluno == true) {
											
									System.out.println("\nAssocie uma turma cadastrada: [Digite o codigo]");
									
									for(Turmas auxiliar : listaTurmas) {
										System.out.println("Codigo: " + auxiliar.getCodigo());
							
									}
									
									String respostaAluno = scanString.nextLine();
									
									boolean encontrou = false;
									
									for(Turmas auxiliar : listaTurmas) {
										if(respostaAluno.trim().equalsIgnoreCase(auxiliar.getCodigo())) {
											auxiliar.addAluno(objAluno);
											encontrou = true;
											objAluno.addTurma(auxiliar);;
											
											System.out.println("\nTurma associada com sucesso!");
										
										}
									}
									
									if(encontrou == false)
									{
										System.out.println("\nDigite uma turma valida!");
										
									}
									else
									{      
											sair_aluno = false;	
									}
								}
								
								
					
								listaAlunos.add(objAluno);
								
								try {
									arquivoAlunos = new FileWriter(caminhoAlunos,true);
									arquivoAlunos.append(objAluno.toString() + "\n");
									arquivoAlunos.close();
								}
								catch (Exception ex1_2)
								{
									System.out.println("\nErro ao gravar arquivo, tente novamente");
								}
								
								sair_do_while1 = false;
							}
							
							catch (Exception ex1)
							{
								sair_do_while1 = true;
								System.out.println("\nErro ao gravar, tente novamente");
							}
						}
					}
					break;
					
				case 2:
					
					if (listaDisciplinas.isEmpty()) {
					    System.out.println("\nCadastre as disciplinas antes!");
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
								
								try {
									arquivoProfessores = new FileWriter(caminhoProfessores,true);
									arquivoProfessores.append(objProfessor.toString());
									arquivoProfessores.close();
								}
								catch (Exception ex2_2)
								{
									System.out.println("\nErro ao gravar arquivo, tente novamente");
								}
								
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
							
							try {
								arquivoDisciplinas = new FileWriter(caminhoDisciplinas,true);
								arquivoDisciplinas.append(objDisciplina.toString() + "\n");
								arquivoDisciplinas.close();
							}
							catch (Exception ex3_2)
							{
								System.out.println("\nErro ao gravar arquivo, tente novamente");
							}
							
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
								
								try {
									arquivoTurmas = new FileWriter(caminhoTurmas,true);
									arquivoTurmas.append(objTurma.toString() + "\n");
									arquivoTurmas.close();
								}
								catch (Exception ex4_2)
								{
									System.out.println("\nErro ao gravar arquivo, tente novamente");
								}
								
								
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
								
								try {
									arquivoNotas = new FileWriter(caminhoNotas,true);
									arquivoNotas.append(objNota.toString() + "\n");
									arquivoNotas.close();
								}
								catch (Exception ex4_2)
								{
									System.out.println("\nErro ao gravar arquivo, tente novamente");
								}
								
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
					
					if(caminhoAlunos.exists())
					{
						try {
							
							System.out.println("Relatorio Alunos: \n");
							for(Alunos auxiliar : listaAlunos)
							{
								System.out.println("\nNome Aluno: " + auxiliar.getNome() + "\nData Nascimento: " + auxiliar.getDataNascimento() + 
										"\nTelefone: " + auxiliar.getTelefone() + "\nEndereco: " + auxiliar.getEndereco().toString() + "\nMatricula: " + auxiliar.getMatricula()
										+ "\nAno Ingresso: " + auxiliar.getAnoIngresso());
							}
							
						}
						catch (Exception ex7){
							System.out.println("\nErro ao ler arquivo, tente novamente!");
						}
					}
					else {
						System.out.println("\nCadastre as disciplinas primeiro!");
					}
					break;
					
				case 7:
					
					if(caminhoProfessores.exists())
					{
						try {
							
							System.out.println("Relatorio Professores: \n");
							for(Professores auxiliar : listaProfessores)
							{
								System.out.println("\nNome Professorer: " + auxiliar.getNome() + "\nData Nascimento: " + auxiliar.getDataNascimento() + 
										"\nTelefone: " + auxiliar.getTelefone() + "\nEndereco: " + auxiliar.getEndereco().toString() + "\nArea Formacao: " + auxiliar.getAreaFormacao()
										+ "\nAno Admissao: " + auxiliar.getAnoAdmissao() + "\nEmail: " + auxiliar.getEmail()
										+ "\nDisciplina: " + auxiliar.getDisciplinas().get(0).getNome());
							}
							
						}
						catch (Exception ex7){
							System.out.println("\nErro ao ler arquivo, tente novamente!");
						}
					}
					else {
						System.out.println("\nCadastre as disciplinas primeiro!");
					}
					
					break;
					
				case 8:
					
					if(caminhoDisciplinas.exists())
					{
						try {
							
							System.out.println("Relatorio Disciplinas: \n");
							for(Disciplinas auxiliar : listaDisciplinas)
							{
								System.out.println("Disciplina: " + auxiliar.getNome() + " - Carga Horaria: " + auxiliar.getCargaHoraria() + " - Codigo: " + auxiliar.getCodigo());
							}
							
						}
						catch (Exception ex8){
							System.out.println("\nErro ao ler arquivo, tente novamente!");
						}
					}
					else {
						System.out.println("\nCadastre as disciplinas primeiro!");
					}
					
					break;
					
				case 9:
					
					if(caminhoTurmas.exists())
					{
						try {
							
							System.out.println("Relatorio Turmas: \n");
							for (Turmas auxiliar : listaTurmas)
							{
								System.out.println("Codigo: " + auxiliar.getCodigo() + "\nDisciplina: " + auxiliar.getDisciplina().getNome() + "\nProfessor : " + auxiliar.getProfessor().getNome());;
							}
							
						}
						catch (Exception ex9){
							System.out.println("\nErro ao ler arquivo, tente novamente!");
						}
					}
					else {
						System.out.println("\nCadastre as turmas primeiro!");
					}
					break;
					
				case 10:
					
					if(caminhoNotas.exists())
					{
						try {
							
							double media=0;
							int contador=0;
							System.out.println("Relatorio Aluno X Notas X Medias: \n");
							for (Notas auxiliar : listaNotas)
							{
								media = media + auxiliar.getValor();
								contador++;
							}
							media = media/contador;
							
							for (Notas auxiliar : listaNotas)
							{
								System.out.println(auxiliar.getDisciplina().getNome() + ": " + auxiliar.getAluno().getNome() + " X " + auxiliar.getValor() + " X " + media);
							}
							
						}
						catch (Exception ex9){
							System.out.println("\nErro ao ler arquivo, tente novamente!");
						}
					}
					else {
						System.out.println("\nCadastre as notas primeiro!");
					}
					break;
					
				case 11:
					
					int contador=0;
					if(caminhoAlunos.exists())
					{
						try {
							
							System.out.println("Quantidade de alunos Cadastrados: \n");
							for(Alunos aux : listaAlunos)
							{
								contador++;								
							}
							System.out.println(contador + " alunos cadastrados");
							
						}
						catch (Exception ex11){
							System.out.println("\nErro ao ler arquivo, tente novamente!");
						}
					}
					else {
						System.out.println("\nCadastre as alunos primeiro!");
					}
					break;
					
				case 12:
					
					String aluno="";
					if(caminhoNotas.exists())
					{
						try {
							
							System.out.println("Maior nota dentre os Alunos: \n");
							double maiorNota=0;
							for(Notas aux : listaNotas)
							{
								if(maiorNota <= aux.getValor())
								{
									aluno = aux.getAluno().getNome();
									maiorNota = aux.getValor();
								}
								
							}
							System.out.println("Aluno com a maior Nota: " + aluno + " - Nota: " + maiorNota);
							
						}
						catch (Exception ex12){
							System.out.println("\nErro ao ler arquivo, tente novamente!");
						}
					}
					else {
						System.out.println("\nCadastre as notas primeiro!");
					}
					break;
					
				case 13:
					
					if(caminhoNotas.exists())
					{
						try {
							
							System.out.println("Relatorio Alunos por Disciplina: \n");
							System.out.println("Digite o codigo da Disciplina: ");
							for(Disciplinas aux : listaDisciplinas)
							{
								System.out.println("Codigo: " + aux.getCodigo() + " - Nome: " + aux.getNome());
							}
							int codDisc = scan.nextInt();
							
							for(Notas aux : listaNotas)
							{
								if(codDisc == aux.getDisciplina().getCodigo()) {
									System.out.println("Aluno: " + aux.getAluno().getNome() + " - Disciplina: " + aux.getDisciplina().getNome());
								}
								
							}
							
						}
						catch (Exception ex13){
							System.out.println("\nErro ao ler arquivo, tente novamente!");
						}
					}
					else {
						System.out.println("\nCadastre as notas primeiro!");
					}
					break;
					
				case 14:
					
					if(caminhoTurmas.exists())
					{
						try {
							
							System.out.println("Relatorio Turmas por professor: \n");
							System.out.println("Digite o nome do Professor: ");
							for(Professores aux : listaProfessores)
							{
								System.out.println("Nome: " + aux.getNome());
							}
							String nomeProf = scanString.nextLine();
							
							for(Turmas aux : listaTurmas)
							{
								if(nomeProf.trim().equals(aux.getProfessor().getNome())) {
									System.out.println("Professor: " + aux.getProfessor().getNome() + " - Disciplina: " + aux.getDisciplina().getNome());
								}
								
							}
							
						}
						catch (Exception ex14){
							System.out.println("\nErro ao ler arquivo, tente novamente!");
						}
					}
					else {
						System.out.println("\nCadastre as Turmas primeiro!");
					}
					
					break;
					
				case 15:
					
					System.out.println("\nObrigado!\n");
					break;
					
				default:
					
					System.out.println("\nDigite uma opcao valida!\n");
				}
				
			}
			
			catch (Exception ex0)
			{
				System.out.println("\nDigite uma opcao valida!\n");
				scan.nextLine();
			}
		}

	}

}
