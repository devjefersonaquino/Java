package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();
		
		lista.add("Maria");
		lista.add("Alex");
		lista.add("Bob");
		lista.add("Ana");
		lista.add("João");
		lista.add("Mari");
		
		//Adicionar item em posição desejada
		lista.add(2, "Jeferson" );
			
		//Tamanho da Lista
		System.out.println(lista.size());
				
		//Imprimir a Lista
		for (String x : lista) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------");
		//Remover item da Lista por Nome
		lista.remove("Ana");
		//Remove item da Lista por posição
		lista.remove(0);
		//Remoção via predicado
		lista.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : lista) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------");
		//Buscar item por nome, retornando posição, senão existir retorna -1
		System.out.println("index of Bob: " + lista.indexOf("Bob"));
		//Buscar item por nome, senão existir retorna -1
		System.out.println("index of Bob: " + lista.indexOf("Juaum"));
		System.out.println("------------------------------");
		// Deixar na lista somente que tem o nome com M por exemplo.
		// filter(operação lambda) collect(Voltar pra Lista)
		List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : resultado) {
			System.out.println(x);
		}
		System.out.println("------------------------------");
		//Buscar elemento da lista por certo predicado, senão encontrar, retornará nulo
		String nome = lista.stream().filter(x -> x.charAt(0) == 'K').findFirst().orElse(null);
		System.out.println(nome);
		
		
		
		
		

	}

}
