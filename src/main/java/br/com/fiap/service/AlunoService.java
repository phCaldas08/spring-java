package br.com.fiap.service;

import java.util.List;

import br.com.fiap.dao.AlunoDAO;
import br.com.fiap.model.Aluno;

public class AlunoService {

	private AlunoDAO alunoDAO = new AlunoDAO();
	
	public List<Aluno> listaAlunos(){
		return alunoDAO.listaAlunos();
	}
	
}
