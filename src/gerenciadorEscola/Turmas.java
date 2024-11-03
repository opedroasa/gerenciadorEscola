package gerenciadorEscola;
import java.util.ArrayList;

public class Turmas {
	//ATRIBUTOS
	private String nome;
	private ArrayList<Alunos> alunos;
	private int codigo;
	private Disciplinas disciplina;
	private Professores professor;
	private int anoLetivo;
	
	//CONSTRUTOR
	public Turmas(String nome, ArrayList<Alunos> alunos, int codigo, Disciplinas disciplina, Professores professor,
			int anoLetivo) {
		super();
		this.nome = nome;
		this.alunos = alunos;
		this.codigo = codigo;
		this.disciplina = disciplina;
		this.professor = professor;
		this.anoLetivo = anoLetivo;
	}

	//METODOS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Alunos> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Alunos> alunos) {
		this.alunos = alunos;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Disciplinas getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplinas disciplina) {
		this.disciplina = disciplina;
	}

	public Professores getProfessor() {
		return professor;
	}

	public void setProfessor(Professores professor) {
		this.professor = professor;
	}

	public int getAnoLetivo() {
		return anoLetivo;
	}

	public void setAnoLetivo(int anoLetivo) {
		this.anoLetivo = anoLetivo;
	}
	

}
