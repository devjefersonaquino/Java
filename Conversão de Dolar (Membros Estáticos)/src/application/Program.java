package application;

import java.util.Locale;
import java.util.Scanner;

import util.CalculoDolar;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor do Dólar: ");
		double dolar = sc.nextDouble();
		System.out.println("Informe o valor de Dólar que deseja adquirir: ");
		double comprar = sc.nextDouble(); 
		
		double total = CalculoDolar.conversao(dolar, comprar);
	
		System.out.printf("Valor a ser pago em Reais com IOF: %.2f%n ", total);
		
	}

}
