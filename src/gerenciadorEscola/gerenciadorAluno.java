package gerenciadorEscola;
import java.util.ArrayList;

public interface gerenciadorAluno {
	public void cadastrarAluno(String nome, String dataNascimento, String telefone, Enderecos endereco,
			int matricula, int anoIngresso, ArrayList<Notas> notas);
}
