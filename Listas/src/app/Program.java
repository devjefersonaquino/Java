package app;

import java.util.Locale;
import java.util.Scanner;

import util.List;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc  = new Scanner(System.in);
		
		List list = new List();
		
		int op;
		
		do {
			showMenu();
			op = sc.nextInt();
			switch (op) {
			case 1: {
				System.out.print("Digite um numero: ");
				double valor = sc.nextDouble();
				list.add(valor);
				break;
			}
			case 2: {
				System.out.println(list.toString());
				break;
			}
			case 3: {
				System.out.println("Fim do Programa!");
				break;
			}
			default:
				System.out.println("Op��o inv�lida!");
			}
			
		} while (op !=3);
		
		
		
		
		
		sc.close();
	}
	
	public static void showMenu() {		
		System.out.println("1 - Inserir elemento na lista");
		System.out.println("2 - Mostrar lista");
		System.out.println("3 - Sair");
	}

}
