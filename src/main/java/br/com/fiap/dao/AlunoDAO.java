package br.com.fiap.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.model.Aluno;

public class AlunoDAO {

	public List<Aluno> listaAlunos(){
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(new Aluno(123, "Pedro", 9.0));
		alunos.add(new Aluno(321, "Patricia", 10.0));
		
		return alunos;
	}
}
