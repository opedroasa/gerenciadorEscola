package gerenciadorEscola;
import java.util.ArrayList;

public class Alunos extends Pessoas implements gerenciadorAluno {
	
	//ATRIBUTOS
	private int matricula;
	private int anoIngresso;
	private ArrayList<Notas> notas;
	private Turmas turma;
	
	//CONSTRUTOR
	public Alunos(String nome, String dataNascimento, String telefone, Enderecos endereco, int matricula,
			int anoIngresso) {
		super(nome, dataNascimento, telefone, endereco);
		this.matricula = matricula;
		this.anoIngresso = anoIngresso;
		notas = new ArrayList<Notas>(); 
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
	
	public Turmas getTurma() {
		return turma;
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
	
	public void addTurma(Turmas turma)
	{
		this.turma = turma;
	}
	
	
	public String toString() {
        return super.getNome() + "\n" + super.getDataNascimento() + "\n" + 
        super.getTelefone() + "\n" + super.getEndereco().toString() + "\n" +
        matricula + "\n" + anoIngresso + "\n" + turma.getCodigo();
	}
	
}
