package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AulaTest {

	public static void main(String[] args) {
		Aula a1 = new Aula("Revistando as ArrayLists", 21);
        Aula a2 = new Aula("Listas de objetos", 20);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

        // codigo para criar a lista de aulas
        
        ArrayList<Aula> aulasList = new ArrayList<>();
        aulasList.add(a1);
        aulasList.add(a2);
        aulasList.add(a3);        
        System.out.println(aulasList);
        
        Collections.sort(aulasList);        
        System.out.println(aulasList);
    
        aulasList.sort(Comparator.comparing(Aula::getTempo));
        System.out.println(aulasList);
        
	}
}
