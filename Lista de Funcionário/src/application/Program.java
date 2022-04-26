package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


import entidade.Funcionario;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionario> lista = new ArrayList<>();

		System.out.print("Informe o numero de funcionarios a ser cadastrados: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("");
			System.out.println("Funcionario #" + i);

			System.out.print("ID: ");
			int id = sc.nextInt();
			while (BuscarID(lista, id)) {
				System.out.print("Id utilizado. Informe outro: ");
				id = sc.nextInt();
			}
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			double salario = sc.nextDouble();
			lista.add(new Funcionario(id, nome, salario));
		}

		System.out.print("Informe o ID do funcionario que terá aumento: ");
		int id = sc.nextInt();
		Funcionario resultado = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (resultado == null) {
			System.out.println("ID inválido!");
		} else {
			System.out.println("Valor da porcetagem: ");
			int percent = sc.nextInt();
			resultado.aumento(percent);
		}
		 System.out.println();
		 System.out.println("Funcionarios: ");
		 
		 for (Funcionario func: lista) {
			 System.out.print(func);
			  
		 }
		 
		sc.close();
	}
	
	public static boolean BuscarID(List<Funcionario> lista, int id) {
		Funcionario emp = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
	

}
