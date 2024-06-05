package aula05junho;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int a;
		System.out.println("Digite o numero: ");
		a = leia.nextInt();

		if (a >= 0 && a % 2 == 0) {
			System.out.println("O numero " + a + " é par e positivo");

		}
		else if(a <0 && a % 2 != 0) {
			System.out.println("O número " + a + " é ímpar e negativo!");
		}
		else if(a <0 && a % 2 == 0) {
			System.out.println("O número " + a + " é par e negativo");
			
		}
		else {
			System.out.println("O numero " + a + " é impar e positivo ");
			
		}

	}

}
