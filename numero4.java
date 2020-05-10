import java.util.Scanner;


public class numero4 {
	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);
		
		int num;
		double num1, num2, num3, r1, r2;
		
		System.out.println("1 - Para média aritmética.");
		System.out.println("2 - Para média ponderada (pesos 3,3,4).");
		System.out.println("Olá, irei calcular a sua média. Digite como você quer que eu calcule:");
        num = leitor.nextInt();	
        
        switch(num) {
         
        case 1:
        	System.out.println("Você escolheu a média aritmética.");
        	
        	System.out.println("Por favor, digite a sua primeira nota:");
        	num1 = leitor.nextDouble();
        	
        	System.out.println("Por favor, digite a segunda nota:");
        	num2 = leitor.nextDouble();
        	
        	System.out.println("Por favor, digite a terceira nota:");
        	num3 = leitor.nextDouble();
        	
        	r1 = (num1+num2+num3)/3;  
        	System.out.println("Sua média foi:" +r1);
        	 
        	break;
        	
        case 2:
        	
        	System.out.println("Você escolheu a média ponderada.");
        	
        	System.out.println("Por favor, digite a sua primeira nota:");
        	num1 = leitor.nextDouble();
        	
        	System.out.println("Por favor, digite a segunda nota:");
        	num2 = leitor.nextDouble();
        	
        	System.out.println("Por favor, digite a terceira nota:");
        	num3 = leitor.nextDouble();
        	
        	r2 = ((num1*3)+(num2*3)+(num3*4))/10;
        	System.out.println("Sua média foi:" +r2);
        	
        	default:
        		System.out.println("Você não digitou corretamente o código da média escolhida, por favor digite novamente.");
        	
        }

		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
