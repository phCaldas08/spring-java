package br.com.fiap.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.fiap.model.Aluno;

public class AlunoDAO {
	private List<Aluno> alunos = new ArrayList<Aluno>();
	
	public List<Aluno> listaAlunos(){
		return alunos;
	}

	public void addAluno(Aluno aluno) {
		alunos.add(aluno);		
	}

	public void deleteAluno(Integer rm) {
		alunos = alunos
				.stream()
				.filter(i -> i.getRm() != rm)
				.collect(Collectors.toList());
	}
}
