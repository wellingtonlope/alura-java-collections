package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {

	public static void main(String[] args) {
		Collection<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		alunos.add("Mauricio Aniche"); //Não permite elementos iguais
		
//		System.out.println(alunos);
		System.out.println(alunos.size());
		
//		for (String aluno : alunos) {
//			System.out.println(aluno);
//		}
		
		// lambda
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		//procurar
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		System.out.println(pauloEstaMatriculado);
		System.out.println(alunos.contains("Sergio Lopes"));
		alunos.remove("Sergio Lopes");
		System.out.println(alunos);
		
		//transforar em lista
		List<String> alunosEmLista = new ArrayList<>(alunos);
		Collections.sort(alunosEmLista);
		System.out.println(alunosEmLista);
	}
	
}
