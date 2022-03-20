package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de Listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		//lista generica
		ArrayList<String> aulasList = new ArrayList<>();
		aulasList.add(aula1);
		aulasList.add(aula2);
		aulasList.add(aula3);
		System.out.println("Adicionados: " + aulasList);

		aulasList.remove(0);		
		System.out.println("Após remoção: " + aulasList);
		
		aulasList.forEach(a -> {
			System.out.println("Aula: " + a);
		});
		
		String primeiraAula = aulasList.get(0);
		System.out.println("A primeira aula é: " + primeiraAula);
		
		for (int i = 0; i < aulasList.size(); i++) {
			System.out.println("aula: " + aulasList.get(1));
		}
		
		aulasList.add("Aumentando nosso conhecimento");
		Collections.sort(aulasList);		
		System.out.println(aulasList);
		
	}
}
