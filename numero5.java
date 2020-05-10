import java.util.Scanner;


public class numero5 {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);

		int num;
		float num1, resultado1, resultado2, resultado3, resultado4;
		float preço1, preço2, preço3, preço4, vdd;
		
		System.out.println("==============================================================");
		System.out.println("| Código |              Condição de Pagamento                |");
		System.out.println("==============================================================");
		System.out.println("|    1   | À vista em dinheiro ou cheque, com 10% de desconto|");
		System.out.println("|    2   | À vista com cartão de crédito, com 5% de desconto |");
		System.out.println("|    3   | Em 2 vezes, preço normal de etiqueta sem juros    |");
		System.out.println("|    4   | Em 3 vezes, preço de etiqueta com acréscimo de 10%|");
		System.out.println("==============================================================");
		
		System.out.println("Quanto que foi o produto que você comprou?");
		num1 = leitor.nextFloat();	
        
		
		System.out.println("Escolha um código de condição de pagamento para efetuar a sua compra.");
		num = leitor.nextInt();	
		
		switch(num) {
        
        case 1:
        	System.out.println("Você escolheu a condição de pagamento à vista em dinheiro ou cheque, com 10% de desconto");
        resultado1 = (float) (num1 * 10)/100;
        preço1 = (float) (num1 - resultado1);
        System.out.println("Compra realizada com sucesso!");
        System.out.println("O valor final da sua compra é: R$" +preço1);
        
        break;
        
        case 2:
        	System.out.println("Você escolheu a condição de pagamento à vista com cartão de crédito, com 5% de desconto");
        resultado2 = (float) (num1 * 5)/100;
        preço2 = (float) (num1 - resultado2);
        System.out.println("Compra realizada com sucesso!");
        System.out.println("O valor final da sua compra é: R$" +preço2);
        
        break;
        
        case 3:
        	System.out.println("Você escolheu a condição de pagamento em 2 vezes, preço normal de etiqueta sem juros");
        preço3 = (float) (num1/2);
        System.out.println("Você irá pagar, sem juros, duas parcelas de: R$" +preço3);
        
        break;
        
        case 4:
        	System.out.println("Você escolheu a condição de pagamento em 3 vezes, preço de etiqueta com acréscimo de 10%");
        resultado4 = (float) (num1 * 10)/100;
        preço4 = (float) (num1 + resultado4);
        vdd = (float) (preço4/3);
        
        System.out.println("Você irá pagar, com acréscimo de 10%, 3 parcelas de: R$" +vdd);
        
        break;
			
	default:
        	System.out.println("Não existe condição de pagamento para esse código. Por favor, digite novamente o código.");
        	
        	
        	
        	
        	
        
        
        }

        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}		
}
