package application;

import java.util.Locale;
import java.util.Scanner;

import entidade.Retangulo;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo ret = new Retangulo();
		
		System.out.println("Informe a altura e largura do triangulo: ");
		ret.altura = sc.nextDouble();
		ret.largura = sc.nextDouble();
		
		System.out.println(ret);
		
	}

}
