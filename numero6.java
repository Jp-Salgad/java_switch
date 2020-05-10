import java.util.Scanner;

public class numero6 {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);
		int se;
		int num;
		int numero1, numero2, numero3, numero4, numero5, numero6, numero7;
		int resultado1, resultado2, resultado3, resultado4, resultado5, resultado6, resultado7;
		int diferença1, diferença2, diferença3, diferença4, diferença5, diferença6, diferença7;
		
		System.out.println("========================================");
		System.out.println("Cargo      |  Código      |  Salário    ");
		System.out.println("Diretor    |    001       |R$ 30.000,00 ");
		System.out.println("Engenheiro |    002       |R$ 10.000,00");
		System.out.println("Técnico    |    003       |R$ 3.000,00");
		System.out.println("Gerente    |    004       |R$ 5.000,00");
		System.out.println("Analista   |    005       |R$ 2.600,00");
		System.out.println("Coordenador|    006       |R$ 3.200,00");
		System.out.println("========================================");
		
		System.out.println("Se quiser saber o aumento de algum cargo da tabela, digite o código.");
		num = leitor.nextInt();	
		
		
		switch(num) {
		
		case 001:
			System.out.println("Você escolheu para ver o aumento do cargo do Diretor.");
		numero1 = (int) (30000 * 0.1);
		resultado1 = (int) (30000 + numero1);
			
			diferença1 = (int) (resultado1 - 30000);
		
		System.out.println("Com o aumento, o salário do diretor agora é: R$" +resultado1);
		System.out.println("A diferença de salário é de: R$" +diferença1);
		System.out.println("O salário antigo era de: R$ 30000");
		
		break;
		
		case 002:
			System.out.println("Você escolheu para ver o aumento do cargo do Engenheiro.");
		numero2 = (int) (10000 * 20)/100;
		resultado2 = (int) (10000 + numero2);
		diferença2 = (int) (resultado2 - 10000);
		
		System.out.println("Com o aumento, o salário do Engenheiro agora é: R$" +resultado2);
		System.out.println("A diferença de salário é de: R$" +diferença2);
		System.out.println("O salário antigo era de: R$ 10000");
		
		break;
		
		case 003:
			System.out.println("Você escolheu para ver o aumento do cargo do Técnico.");
		numero3 = (int) (3000 * 30)/100;
		resultado3 = (int) (3000 + numero3);
		diferença3 = (int) (resultado3 - 3000);
		
		System.out.println("Com o aumento, o salário do Técnico agora é: R$" +resultado3);
		System.out.println("A diferença de salário é de: R$" +diferença3);
		System.out.println("O salário antigo era de: R$ 3000");
		
		break;
		
		case 004:
			System.out.println("Você escolheu para ver o aumento do cargo do Gerente.");
		numero4 = (int) (5000 * 10)/100;
		resultado4 = (int) (5000 + numero4);
		diferença4 = (int) (resultado4 - 5000);
		
		System.out.println("Com o aumento, o salário do Gerente agora é: R$" +resultado4);
		System.out.println("A diferença de salário é de: R$" +diferença4);
		System.out.println("O salário antigo era de: R$ 5000");
		
		break;
		
		case 005:
			System.out.println("Você escolheu para ver o aumento do cargo do Analista");
		numero5 = (int) (2600 * 30)/100;
		resultado5 = (int) (2600 + numero5);
		diferença5 = (int) (resultado5 - 2600);
		
		System.out.println("Com o aumento, o salário do Analista agora é: R$" +resultado5);
		System.out.println("A diferença de salário é de: R$" +diferença5);
		System.out.println("O salário antigo era de: R$ 2600");
		
		break;
		
		case 006:
			System.out.println("Você escolheu para ver o aumento do cargo do Coordenador.");
		numero6 = (int) (3200 * 20)/100;
		resultado6 = (int) (3200 + numero6);
		diferença6 = (int) (resultado6 - 3200);
		
		System.out.println("Com o aumento, o salário do Coordenador agora é: R$" +resultado6);
		System.out.println("A diferença de salário é de: R$" +diferença6);
		System.out.println("O salário antigo era de: R$ 3200");
		break;
		default:
			System.out.println("O código digitado não está na tabela, digite o salário do seu cargo, que eu mostrarei o aumento.");
	        se = leitor.nextInt();
	        
	        numero7 = (int) (se * 40)/100;
	        resultado7 = (int) (se + numero7);
	        diferença7 = (int) (resultado7 - se);
	        
	        System.out.println("Com o aumento, o salário seu agora é de: R$" +resultado7);
			System.out.println("A diferença de salário é de: R$" +diferença7);
			System.out.println("O salário antigo era de: R$" +se);
	        
	
			
	        
			
			
		
		
		
		
		
		
		
		}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}