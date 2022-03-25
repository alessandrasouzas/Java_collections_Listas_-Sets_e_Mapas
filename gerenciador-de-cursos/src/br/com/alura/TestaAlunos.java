package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");

        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        System.out.println(alunos);   

        /*
         * Set possui maior velocidade de busca por usar internamente uma tabela de espalhamento
         * Set n�o ordena ao inserir um novo elemento, logo n�o implementa o metodo sort
         * Set n�o permite repeti��es de elementos e n�o possuem indice  
         * 
         */
        

    }
}