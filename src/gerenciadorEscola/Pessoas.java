package gerenciadorEscola;

public abstract class Pessoas {
	//ATRIBUTOS
	private String nome;
	private String dataNascimento;
	private String telefone;
	private Enderecos endereco;
	
	//CONSTRUTOR
	public Pessoas(String nome, String dataNascimento, String telefone, Enderecos endereco) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	public Pessoas ()
	{
		
	}

	//METODOS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Enderecos getEndereco() {
		return endereco;
	}

	public void setEndereco(Enderecos endereco) {
		this.endereco = endereco;
	}
	
	
	
	
}
