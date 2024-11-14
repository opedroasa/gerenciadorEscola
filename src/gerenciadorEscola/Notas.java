package gerenciadorEscola;

public class Notas {
	//ATRIBUTOS
	private double valor;
	private String data;
	private Alunos aluno;
	private Disciplinas disciplina;
	
	//CONSTRUTOR
	public Notas(double valor, String data, Alunos aluno, Disciplinas disciplina) {
		super();
		this.valor = valor;
		this.data = data;
		this.aluno = aluno;
		this.disciplina = disciplina;
	}

	//METODOS
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Alunos getAluno() {
		return aluno;
	}

	public void setAluno(Alunos aluno) {
		this.aluno = aluno;
	}

	public Disciplinas getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplinas disciplina) {
		this.disciplina = disciplina;
	}
	
	public String toString() {
        return valor + "\n" + data + "\n" + aluno.getNome() + "\n" + disciplina.getNome();
	}
	
	
}
