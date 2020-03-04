package br.com.fiap.controller;

import java.util.List;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.fiap.model.Aluno;
import br.com.fiap.service.AlunoService;

@Controller
public class AlunoController {

	private AlunoService alunoService = new AlunoService();

	@RequestMapping(value = "/aluno", method = RequestMethod.GET)
	public String aluno(Model model) {

		List<Aluno> alunos = alunoService.listaAlunos();
		model.addAttribute("listaAlunos", alunos);

		return "aluno";
	}
	
	@RequestMapping(value = "/aluno/novo", method = RequestMethod.POST)
	public String novoAluno(Model model, Aluno aluno) {		
		alunoService.novoAluno(aluno);		
		
		return aluno(model);
	}
	
	@RequestMapping(value = "/aluno/delete", method = RequestMethod.POST)
	public String removerAluno(Model model, Integer rm) {		
		alunoService.removerAluno(rm);		
		
		return aluno(model);
	}
	
}
