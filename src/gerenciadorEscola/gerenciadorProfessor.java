package gerenciadorEscola;
import java.util.ArrayList;

public interface gerenciadorProfessor {
	public void cadastrarProfessor (String nome, String dataNascimento, String telefone, Enderecos endereco,
			String areaFormacao, int anoAdmissao, String email, ArrayList<Disciplinas> disciplinas);
}
