package application;

import java.util.Locale;
import java.util.Scanner;

import entidade.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		
		System.out.println("Nome: ");
		func.nome = sc.nextLine();
		System.out.println("Salario Bruto: ");
		func.salario = sc.nextDouble();
		System.out.println("Impostos: ");
		func.impostos = sc.nextDouble();
		System.out.println("");
		System.out.println("Dados do Funcionário: " + func);
		System.out.println("");
		System.out.println("Deseja quantos % no salario do Funcionario: ");
		double pc = sc.nextDouble();
		func.aumentoSalario(pc);
		System.out.println("");
		System.out.println("Dados do Funcionário Atualizado: " + func);
	}
	
}
