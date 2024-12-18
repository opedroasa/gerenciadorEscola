package gerenciadorEscola;
import java.util.ArrayList;

public class Turmas {
	//ATRIBUTOS
	private ArrayList<Alunos> alunos;
	private String codigo;
	private Disciplinas disciplina;
	private Professores professor;
	private int anoLetivo;
	
	//CONSTRUTOR
	public Turmas(ArrayList<Alunos> alunos, String codigo, Disciplinas disciplina, Professores professor,
			int anoLetivo) {
		super();
		this.alunos = alunos;
		this.codigo = codigo;
		this.disciplina = disciplina;
		this.professor = professor;
		this.anoLetivo = anoLetivo;
	}
	
	public Turmas(String codigo, Disciplinas disciplina, Professores professor,
			int anoLetivo) {
		super();
		this.codigo = codigo;
		this.disciplina = disciplina;
		this.professor = professor;
		this.anoLetivo = anoLetivo;
		alunos = new ArrayList<Alunos>();
		
	}
	
	public Turmas() {
		super();
		alunos = new ArrayList<Alunos>();
		
	}

	//METODOS

	public ArrayList<Alunos> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Alunos> alunos) {
		this.alunos = alunos;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
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
	
	public void addAluno (Alunos aluno)
	{
		this.alunos.add(aluno);
	}
	
	public String toString() {
        return codigo + "\n" + disciplina.getNome() + "\n" + professor.getNome() + "\n" + anoLetivo;
	}

}
