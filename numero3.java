import java.util.Scanner;

public class numero3 {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);
		
		int num;
		
		System.out.println("Ol�, bem vindo ao menu de op��es!");
		

		System.out.println("=====================");
		System.out.println("| 1 | | 2 | | 3 | 4 |");
		System.out.println("=====================");
	
		
		System.out.println("Por favor, escolha uma das op��es:");
		num = leitor.nextInt();		
		
switch(num) {
		
		case 001:
			System.out.println("Executa a rotina de Inclus�o de Alunos");
		break;
		case 002: 
			System.out.println("Executa a rotina de Altera��o de Alunos");
		break;
		case 003:
			System.out.println("Executa a rotina de Exclus�o de Alunos");
		break;
		case 004:
			System.out.println("Executa a rotina de Consulta de Alunos");
		break;
		default:
			System.out.println("ERRO! Digite c�digo novamente.");
		
		
		
		
		
		
		
		
		
		
		
}
		
		
	}
}
