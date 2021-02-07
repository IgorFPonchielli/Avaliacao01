import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
		
		String resposta;
		
		ArrayList<Beneficiario> beneficiarios = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		do  {
			AdicionarNovoBeneficiario(beneficiarios);
			System.out.println("\n\nVocê gostaria de informar um novo beneficiário?");
			resposta = input.next();
		} while (resposta.equals("sim"));
					
	}
	
	public static void AdicionarNovoBeneficiario(ArrayList<Beneficiario> beneficiarios) {
		Scanner input = new Scanner(System.in);
		String nome;
		String dataNascimento;
		Categoria categoria = null;
		String estado;
				
		System.out.println("\nNome completo do beneficiario: ");
		nome = input.next();
		
		System.out.println("\nData de Nascimento do beneficiario:");
		dataNascimento = input.next();
		
		System.out.println("\nCategoria do beneficiario: ");
		
		System.out.println("1 - Empregado");
		System.out.println("2 - Empregador");
		System.out.println("3 - Desempregado");
		
		switch (input.nextInt()) {
		case 1:
			categoria = Categoria.EMPREGADO;
			break;
		
		case 2:	
			categoria = Categoria.EMPREGADOR;
			break;
					
		case 3:
			categoria = Categoria.DESEMPREGADO;
			break;

		default:
				break;
			}
		
		System.out.println("\nEstado do beneficiario (UF): ");
		estado = input.next();
		
		
		Beneficiario beneficiario = new Beneficiario(nome, dataNascimento, categoria, estado);
		beneficiarios.add(beneficiario);
		
		//System.out.println(beneficiario.toString());
		beneficiario.ValidarCategoria();	
		
	}
}
