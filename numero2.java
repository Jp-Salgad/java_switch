import java.util.Scanner;

public class numero2 {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);
		
        int num, pedido;
        float numero1, numero2, numero3, numero4, numero5;
        
        
        System.out.println("Ol�, bem vindo ao nosso restaurante. Est� pronto para o seu pedido?");
        System.out.println("Aqui est� o nosso card�pio:");
        System.out.println("====================================================================");
        System.out.println("Especifica��o   | C�digo | Pre�o");
        System.out.println("Cachorro quente | 100    | 3,20");
        System.out.println("Bauru com ovo   | 102    | 5,50");
        System.out.println("Hamb�rger       | 103    | 3,20");
        System.out.println("Cheeseburguer   | 104    | 4,30");  
        System.out.println("Refrigerante    | 105    | 4,00");
        
        System.out.println("Muito bem, se voc� j� escolheu o seu pedido. Por favor, digite o c�digo dele aqui:");
         num = leitor.nextInt();	
        System.out.println("Muito bem, quantos voc� quer?");
        pedido = leitor.nextInt();
       
        numero1 = (float) (3.50 * pedido);
        numero2 = (float) (5.50 * pedido);
        numero3 = (float) (3.20 * pedido);
        numero4 = (float) (4.30 * pedido);
        numero5 = (float)  (4.00 * pedido);
        
        
        switch(num) {
        
        case 100:
			System.out.println("Seu pedido � o cachorro quente, o pre�o dele �:" +numero1);
		break;
		case 102: 
			System.out.println("Seu pedido � o Bauru com ovo, o pre�o dele �:" +numero2);
		break;
		case 103:
			System.out.println("Seu pedido � o Hamb�rguer, o pre�o dele �:" +numero3);
		break;
		case 104:
			System.out.println("Seu pedido � Cheeseburguer, o pre�o dele �:" +numero4);
		break;
		case 105:
			System.out.println("Seu pedido � o refrigerante, o pre�o dele �:" +numero5);
		default:
			System.out.println("Voc� n�o colocou o c�digo certo! Digite novamente.");
        
        
        
        
       
        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}