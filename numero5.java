import java.util.Scanner;


public class numero5 {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);

		int num;
		float num1, resultado1, resultado2, resultado3, resultado4;
		float pre�o1, pre�o2, pre�o3, pre�o4, vdd;
		
		System.out.println("==============================================================");
		System.out.println("| C�digo |              Condi��o de Pagamento                |");
		System.out.println("==============================================================");
		System.out.println("|    1   | � vista em dinheiro ou cheque, com 10% de desconto|");
		System.out.println("|    2   | � vista com cart�o de cr�dito, com 5% de desconto |");
		System.out.println("|    3   | Em 2 vezes, pre�o normal de etiqueta sem juros    |");
		System.out.println("|    4   | Em 3 vezes, pre�o de etiqueta com acr�scimo de 10%|");
		System.out.println("==============================================================");
		
		System.out.println("Quanto que foi o produto que voc� comprou?");
		num1 = leitor.nextFloat();	
        
		
		System.out.println("Escolha um c�digo de condi��o de pagamento para efetuar a sua compra.");
		num = leitor.nextInt();	
		
		switch(num) {
        
        case 1:
        	System.out.println("Voc� escolheu a condi��o de pagamento � vista em dinheiro ou cheque, com 10% de desconto");
        resultado1 = (float) (num1 * 10)/100;
        pre�o1 = (float) (num1 - resultado1);
        System.out.println("Compra realizada com sucesso!");
        System.out.println("O valor final da sua compra �: R$" +pre�o1);
        
        break;
        
        case 2:
        	System.out.println("Voc� escolheu a condi��o de pagamento � vista com cart�o de cr�dito, com 5% de desconto");
        resultado2 = (float) (num1 * 5)/100;
        pre�o2 = (float) (num1 - resultado2);
        System.out.println("Compra realizada com sucesso!");
        System.out.println("O valor final da sua compra �: R$" +pre�o2);
        
        break;
        
        case 3:
        	System.out.println("Voc� escolheu a condi��o de pagamento em 2 vezes, pre�o normal de etiqueta sem juros");
        pre�o3 = (float) (num1/2);
        System.out.println("Voc� ir� pagar, sem juros, duas parcelas de: R$" +pre�o3);
        
        break;
        
        case 4:
        	System.out.println("Voc� escolheu a condi��o de pagamento em 3 vezes, pre�o de etiqueta com acr�scimo de 10%");
        resultado4 = (float) (num1 * 10)/100;
        pre�o4 = (float) (num1 + resultado4);
        vdd = (float) (pre�o4/3);
        
        System.out.println("Voc� ir� pagar, com acr�scimo de 10%, 3 parcelas de: R$" +vdd);
        
        default:
        	System.out.println("N�o existe condi��o de pagamento para esse c�digo. Por favor, digite novamente o c�digo.");
        	
        	
        	
        	
        	
        
        
        }

        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}		
}
