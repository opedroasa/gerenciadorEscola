package gerenciadorEscola;
import java.util.ArrayList;

public class Professores extends Pessoas implements gerenciadorProfessor {
	//ATRIBUTOS
	private String areaFormacao;
	private int anoAdmissao;
	private String email;
	private ArrayList<Disciplinas> disciplinas;
	
	//CONSTRUTOR
	public Professores(String nome, String dataNascimento, String telefone, Enderecos endereco, String areaFormacao,
			int anoAdmissao, String email, ArrayList<Disciplinas> disciplinas) {
		super(nome, dataNascimento, telefone, endereco);
		this.areaFormacao = areaFormacao;
		this.anoAdmissao = anoAdmissao;
		this.email = email;
		this.disciplinas = disciplinas;
	}
	
	public Professores()
	{
		super();
	}
	
	//METODOS
	
	@Override
	public void cadastrarProfessor (String nome, String dataNascimento, String telefone, Enderecos endereco,
			String areaFormacao, int anoAdmissao, String email, ArrayList<Disciplinas> disciplinas) {
		setNome(nome);
		setDataNascimento(dataNascimento);
		setTelefone(telefone);
		setEndereco(endereco);
		this.areaFormacao = areaFormacao;
		this.anoAdmissao = anoAdmissao;
		this.email = email;
		this.disciplinas = disciplinas;
	}

	public String getAreaFormacao() {
		return areaFormacao;
	}

	public void setAreaFormacao(String areaFormacao) {
		this.areaFormacao = areaFormacao;
	}

	public int getAnoAdmissao() {
		return anoAdmissao;
	}

	public void setAnoAdmissao(int anoAdmissao) {
		this.anoAdmissao = anoAdmissao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<Disciplinas> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<Disciplinas> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	
}

