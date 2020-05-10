import java.util.Scanner;

public class numero3 {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);
		
		int num;
		
		System.out.println("Olá, bem vindo ao menu de opções!");
		

		System.out.println("=====================");
		System.out.println("| 1 | | 2 | | 3 | 4 |");
		System.out.println("=====================");
	
		
		System.out.println("Por favor, escolha uma das opções:");
		num = leitor.nextInt();		
		
switch(num) {
		
		case 001:
			System.out.println("Executa a rotina de Inclusão de Alunos");
		break;
		case 002: 
			System.out.println("Executa a rotina de Alteração de Alunos");
		break;
		case 003:
			System.out.println("Executa a rotina de Exclusão de Alunos");
		break;
		case 004:
			System.out.println("Executa a rotina de Consulta de Alunos");
		break;
		default:
			System.out.println("ERRO! Digite código novamente.");
		
		
		
		
		
		
		
		
		
		
		
}
		
		
	}
}
