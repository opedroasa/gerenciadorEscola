package gerenciadorEscola;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int menu=0;
		
		while (menu != 15)
		{
			System.out.println("===============\n"
					+ "MENU PRINCIPAL\n"
					+ "===============");
			try
			{
				menu = scan.nextInt();
			}
			
			catch (Exception ex1)
			{
				System.out.println("Digite uma opcao valida!");
				menu = scan.nextInt(); //tentar limpar buffer
			}
		}

	}

}