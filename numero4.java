import java.util.Scanner;


public class numero4 {
	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);
		
		int num;
		double num1, num2, num3, r1, r2;
		
		System.out.println("1 - Para m�dia aritm�tica.");
		System.out.println("2 - Para m�dia ponderada (pesos 3,3,4).");
		System.out.println("Ol�, irei calcular a sua m�dia. Digite como voc� quer que eu calcule:");
        num = leitor.nextInt();	
        
        switch(num) {
         
        case 1:
        	System.out.println("Voc� escolheu a m�dia aritm�tica.");
        	
        	System.out.println("Por favor, digite a sua primeira nota:");
        	num1 = leitor.nextDouble();
        	
        	System.out.println("Por favor, digite a segunda nota:");
        	num2 = leitor.nextDouble();
        	
        	System.out.println("Por favor, digite a terceira nota:");
        	num3 = leitor.nextDouble();
        	
        	r1 = (num1+num2+num3)/3;  
        	System.out.println("Sua m�dia foi:" +r1);
        	 
        	break;
        	
        case 2:
        	
        	System.out.println("Voc� escolheu a m�dia ponderada.");
        	
        	System.out.println("Por favor, digite a sua primeira nota:");
        	num1 = leitor.nextDouble();
        	
        	System.out.println("Por favor, digite a segunda nota:");
        	num2 = leitor.nextDouble();
        	
        	System.out.println("Por favor, digite a terceira nota:");
        	num3 = leitor.nextDouble();
        	
        	r2 = ((num1*3)+(num2*3)+(num3*4))/10;
        	System.out.println("Sua m�dia foi:" +r2);
        	
        	default:
        		System.out.println("Voc� n�o digitou corretamente o c�digo da m�dia escolhida, por favor digite novamente.");
        	
        }

		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
