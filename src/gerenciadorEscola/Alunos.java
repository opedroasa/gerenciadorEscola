package gerenciadorEscola;
import java.util.ArrayList;

public class Alunos extends Pessoas implements gerenciadorAluno {
	
	//ATRIBUTOS
	private int matricula;
	private int anoIngresso;
	private ArrayList<Notas> notas;
	
	//CONSTRUTOR
	public Alunos(String nome, String dataNascimento, String telefone, Enderecos endereco, int matricula,
			int anoIngresso, ArrayList<Notas> notas, Turmas turma) {
		super(nome, dataNascimento, telefone, endereco);
		this.matricula = matricula;
		this.anoIngresso = anoIngresso;
		this.notas = notas;
	}
	
	public Alunos()
	{
		super();
	}

	//METODOS
	
	@Override
	public void cadastrarAluno(String nome, String dataNascimento, String telefone, Enderecos endereco,
			int matricula, int anoIngresso, ArrayList<Notas> notas) {
		setNome(nome);
		setDataNascimento(dataNascimento);
		setTelefone(telefone);
		setEndereco(endereco);
		this.matricula = matricula;
		this.anoIngresso = anoIngresso;
		this.notas = notas;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getAnoIngresso() {
		return anoIngresso;
	}

	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}

	public ArrayList<Notas> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Notas> notas) {
		this.notas = notas;
	}
	
	

}
