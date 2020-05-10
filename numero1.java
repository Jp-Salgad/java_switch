import java.util.Scanner;

public class numero1 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);
		
		int num;
				
		
		System.out.println("Olá, digite um código, e eu te direi de qual produto ele é:");
		num = leitor.nextInt();		

		
		switch(num) {
		
		case 001:
			System.out.println("Parafuso");
		break;
		case 002: 
			System.out.println("Porca");
		break;
		case 003:
			System.out.println("Prego");
		break;
		case 004:
			System.out.println("Ferramenta");
		break;
		default:
			System.out.println("Diversos");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}