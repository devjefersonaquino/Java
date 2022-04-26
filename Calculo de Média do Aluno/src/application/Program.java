package application;

import java.util.Locale;
import java.util.Scanner;

import entidade.Aluno;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Informe o nome do Aluno: ");
		aluno.nome = sc.nextLine();
		System.out.println("Informe a Primeira nota do Aluno: ");
		aluno.nota1 = sc.nextDouble();
		System.out.println("Informe a Segunda nota do Aluno: ");
		aluno.nota2 = sc.nextDouble();
		System.out.println("Informe a Terceira nota do Aluno: ");
		aluno.nota3 = sc.nextDouble();

		aluno.aprovacao();
	}

}
