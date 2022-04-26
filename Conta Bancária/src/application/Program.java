package application;

import java.util.Locale;
import java.util.Scanner;

import entidade.ContaCorrente;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaCorrente conta;
		
		System.out.println("Numero da Conta: ");
		int n = sc.nextInt();
		System.out.println("Nome da Conta: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.println("Deposito inicial? (y/n)");
		char resposta = sc.next().charAt(0);
		if (resposta == 'y') {
			System.out.println("Digite o valor do deposito: ");
			double inicialDeposito = sc.nextDouble();
			conta = new ContaCorrente(n, nome, inicialDeposito);
		} else {
			conta = new ContaCorrente(n, nome);
		}
		
		System.out.println("");
		System.out.println("Dados da Conta: ");
		System.out.println(conta);
		System.out.println();
		
		System.out.println("Valor do deposito: ");
		double valor = sc.nextDouble();
		conta.deposito(valor);
		
		System.out.println("");
		System.out.println("Dados da Conta: ");
		System.out.println(conta);
		System.out.println();
		
		System.out.println("Valor do Saque: ");
		valor = sc.nextDouble();
		conta.saque(valor);
		
		System.out.println("");
		System.out.println("Dados da Conta: ");
		System.out.println(conta);
		System.out.println();
		
		
		sc.close();
	}

}
