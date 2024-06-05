package aula05junho;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int codigo, quantidade;
		String produto = "";
		double valorTotal, preco = 0;
		

		System.out.println(" Digite o código do produto ");
		codigo = leia.nextInt();

		switch (codigo) {
		case 1:
			produto = "Cachorro quente ";
			preco = 10.00;
			break;

		case 2:
			produto = "X-Salada ";
			preco = 15.00;
			break;

		case 3:
			produto = "X-Bacon ";
			preco = 18.00;
			break;

		case 4:
			produto = "Bauru ";
			preco = 12.00;
			break;

		case 5:
			produto = "Refrigerante";
			preco = 8.00;
			break;

		case 6:
			produto = "suco de laranja";
			preco = 13.00;
			break;

		default:
			System.out.println("Digite um valor válido");
			break;

		}
		System.out.println("Quantidade: ");
		quantidade = leia.nextInt();
		
		valorTotal = quantidade * preco;
		
		System.out.println( "Produto: " + produto );
		System.out.println("Valor total:R$ " + valorTotal);
		
		
		

	}

}
