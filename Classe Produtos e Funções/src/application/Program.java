package application;

import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		System.out.println("Dados do produto: ");
		System.out.println("Nome: ");
		produto.nome = sc.nextLine();
		System.out.println("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.println("Quantidade em estoque: ");
		produto.qtd = sc.nextInt();
		
		System.out.println("");
		System.out.println("Dados do produto: " + produto);
		System.out.println("");
		System.out.println("Digite a quantidade de produtos a serem adiconados no estoque: ");
		int adicionaProduto = sc.nextInt();
		produto.addProdutos(adicionaProduto);
		System.out.println("");
		System.out.println("Produtos adicionados: " + produto);
		System.out.println("");
		
		System.out.println("Digite a quantidade de produtos a serem removidos no estoque: ");
		int removeProduto = sc.nextInt();
		produto.removeProdutos(removeProduto);			
		System.out.println("");
		System.out.println("Produtos removidos: " + produto);
		System.out.println("");
	}

}
