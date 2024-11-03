package gerenciadorEscola;
import java.util.ArrayList;

public class Disciplinas {
	//ATRIBUTOS
	private String nome;
	private int cargaHoraria;
	private int codigo;
	private ArrayList <Professores> professores;
	
	//CONSTRUTOR
	public Disciplinas(String nome, int cargaHoraria, int codigo, ArrayList<Professores> professores) {
		super();
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.codigo = codigo;
		this.professores = professores;
	}

	//METODOS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public ArrayList<Professores> getProfessores() {
		return professores;
	}

	public void setProfessores(ArrayList<Professores> professores) {
		this.professores = professores;
	}
	
	
}


