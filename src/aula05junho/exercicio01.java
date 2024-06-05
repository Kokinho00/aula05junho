package aula05junho;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		int a, b, c;
		
		System.out.println("Digite o número A: ");
		a = leia.nextInt();
		
		System.out.println("Digite o número B: ");
		b = leia.nextInt();
		
		System.out.println("Digite o numero C: ");
		c = leia.nextInt();
		
		if(a + b> c ) {
			System.out.println(b + " + " + a + " = " + (a + b ) + " > " + c);
			System.out.println("A Soma de A + B é Maior do que C");
						
		}
		else if( a + b< c ) {
			System.out.println(a + " + " + b + " = " + ( a + b ) + " < " + c);
			System.out.println("A Soma de A+B é menor do que C");
			
		}
		else {
			System.out.println(a + " + " + b + " = " + ( a + b ) + " = " + c);
			System.out.println(" A Soma de A+B é igual a C ");
		}
		

	}

}
