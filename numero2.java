import java.util.Scanner;

public class numero2 {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);
		
        int num, pedido;
        float numero1, numero2, numero3, numero4, numero5;
        
        
        System.out.println("Olá, bem vindo ao nosso restaurante. Está pronto para o seu pedido?");
        System.out.println("Aqui está o nosso cardápio:");
        System.out.println("====================================================================");
        System.out.println("Especificação   | Código | Preço");
        System.out.println("Cachorro quente | 100    | 3,20");
        System.out.println("Bauru com ovo   | 102    | 5,50");
        System.out.println("Hambúrger       | 103    | 3,20");
        System.out.println("Cheeseburguer   | 104    | 4,30");  
        System.out.println("Refrigerante    | 105    | 4,00");
        
        System.out.println("Muito bem, se você já escolheu o seu pedido. Por favor, digite o código dele aqui:");
         num = leitor.nextInt();	
        System.out.println("Muito bem, quantos você quer?");
        pedido = leitor.nextInt();
       
        numero1 = (float) (3.50 * pedido);
        numero2 = (float) (5.50 * pedido);
        numero3 = (float) (3.20 * pedido);
        numero4 = (float) (4.30 * pedido);
        numero5 = (float)  (4.00 * pedido);
        
        
        switch(num) {
        
        case 100:
			System.out.println("Seu pedido é o cachorro quente, o preço dele é:" +numero1);
		break;
		case 102: 
			System.out.println("Seu pedido é o Bauru com ovo, o preço dele é:" +numero2);
		break;
		case 103:
			System.out.println("Seu pedido é o Hambúrguer, o preço dele é:" +numero3);
		break;
		case 104:
			System.out.println("Seu pedido é Cheeseburguer, o preço dele é:" +numero4);
		break;
		case 105:
			System.out.println("Seu pedido é o refrigerante, o preço dele é:" +numero5);
		default:
			System.out.println("Você não colocou o código certo! Digite novamente.");
        
        
        
        
       
        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}