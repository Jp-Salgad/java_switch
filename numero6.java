import java.util.Scanner;

public class numero6 {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);
		int se;
		int num;
		int numero1, numero2, numero3, numero4, numero5, numero6, numero7;
		int resultado1, resultado2, resultado3, resultado4, resultado5, resultado6, resultado7;
		int diferen�a1, diferen�a2, diferen�a3, diferen�a4, diferen�a5, diferen�a6, diferen�a7;
		
		System.out.println("========================================");
		System.out.println("Cargo      |  C�digo      |  Sal�rio    ");
		System.out.println("Diretor    |    001       |R$ 30.000,00 ");
		System.out.println("Engenheiro |    002       |R$ 10.000,00");
		System.out.println("T�cnico    |    003       |R$ 3.000,00");
		System.out.println("Gerente    |    004       |R$ 5.000,00");
		System.out.println("Analista   |    005       |R$ 2.600,00");
		System.out.println("Coordenador|    006       |R$ 3.200,00");
		System.out.println("========================================");
		
		System.out.println("Se quiser saber o aumento de algum cargo da tabela, digite o c�digo.");
		num = leitor.nextInt();	
		
		
		switch(num) {
		
		case 001:
			System.out.println("Voc� escolheu para ver o aumento do cargo do Diretor.");
		numero1 = (int) (30000 * 0.1);
		resultado1 = (int) (30000 + numero1);
			
			diferen�a1 = (int) (resultado1 - 30000);
		
		System.out.println("Com o aumento, o sal�rio do diretor agora �: R$" +resultado1);
		System.out.println("A diferen�a de sal�rio � de: R$" +diferen�a1);
		System.out.println("O sal�rio antigo era de: R$ 30000");
		
		break;
		
		case 002:
			System.out.println("Voc� escolheu para ver o aumento do cargo do Engenheiro.");
		numero2 = (int) (10000 * 20)/100;
		resultado2 = (int) (10000 + numero2);
		diferen�a2 = (int) (resultado2 - 10000);
		
		System.out.println("Com o aumento, o sal�rio do Engenheiro agora �: R$" +resultado2);
		System.out.println("A diferen�a de sal�rio � de: R$" +diferen�a2);
		System.out.println("O sal�rio antigo era de: R$ 10000");
		
		break;
		
		case 003:
			System.out.println("Voc� escolheu para ver o aumento do cargo do T�cnico.");
		numero3 = (int) (3000 * 30)/100;
		resultado3 = (int) (3000 + numero3);
		diferen�a3 = (int) (resultado3 - 3000);
		
		System.out.println("Com o aumento, o sal�rio do T�cnico agora �: R$" +resultado3);
		System.out.println("A diferen�a de sal�rio � de: R$" +diferen�a3);
		System.out.println("O sal�rio antigo era de: R$ 3000");
		
		break;
		
		case 004:
			System.out.println("Voc� escolheu para ver o aumento do cargo do Gerente.");
		numero4 = (int) (5000 * 10)/100;
		resultado4 = (int) (5000 + numero4);
		diferen�a4 = (int) (resultado4 - 5000);
		
		System.out.println("Com o aumento, o sal�rio do Gerente agora �: R$" +resultado4);
		System.out.println("A diferen�a de sal�rio � de: R$" +diferen�a4);
		System.out.println("O sal�rio antigo era de: R$ 5000");
		
		break;
		
		case 005:
			System.out.println("Voc� escolheu para ver o aumento do cargo do Analista");
		numero5 = (int) (2600 * 30)/100;
		resultado5 = (int) (2600 + numero5);
		diferen�a5 = (int) (resultado5 - 2600);
		
		System.out.println("Com o aumento, o sal�rio do Analista agora �: R$" +resultado5);
		System.out.println("A diferen�a de sal�rio � de: R$" +diferen�a5);
		System.out.println("O sal�rio antigo era de: R$ 2600");
		
		break;
		
		case 006:
			System.out.println("Voc� escolheu para ver o aumento do cargo do Coordenador.");
		numero6 = (int) (3200 * 20)/100;
		resultado6 = (int) (3200 + numero6);
		diferen�a6 = (int) (resultado6 - 3200);
		
		System.out.println("Com o aumento, o sal�rio do Coordenador agora �: R$" +resultado6);
		System.out.println("A diferen�a de sal�rio � de: R$" +diferen�a6);
		System.out.println("O sal�rio antigo era de: R$ 3200");
		break;
		default:
			System.out.println("O c�digo digitado n�o est� na tabela, digite o sal�rio do seu cargo, que eu mostrarei o aumento.");
	        se = leitor.nextInt();
	        
	        numero7 = (int) (se * 40)/100;
	        resultado7 = (int) (se + numero7);
	        diferen�a7 = (int) (resultado7 - se);
	        
	        System.out.println("Com o aumento, o sal�rio seu agora � de: R$" +resultado7);
			System.out.println("A diferen�a de sal�rio � de: R$" +diferen�a7);
			System.out.println("O sal�rio antigo era de: R$" +se);
	        
	
			
	        
			
			
		
		
		
		
		
		
		
		}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}