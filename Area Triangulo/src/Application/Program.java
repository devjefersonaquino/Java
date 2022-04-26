package Application;

import java.util.Locale;
import java.util.Scanner;

import entidade.Triangulo;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Informe as areas do triangulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Informe as areas do triangulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double p = (x.a + x.b + x.c) / 2;
		double AreaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		
		p = (y.a + y.b + y.c) / 2;
		double AreaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		
		System.out.printf("Triangulo X area: %.4f%n", AreaX);
		System.out.printf("Triangulo Y area: %.4f%n", AreaY);
		
		if (AreaX > AreaY) {
			System.out.println("Area Maior: X");
		} else {
			System.out.println("Area Maior: Y");
		}
		
		sc.close();
	}

}
