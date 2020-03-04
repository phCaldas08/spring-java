package br.com.fiap.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fiap.model.Aluno;
import br.com.fiap.service.AlunoService;

@Controller
public class AlunoController {

	private AlunoService alunoService = new AlunoService();

	@RequestMapping("/aluno")
	public String aluno(Model model) {

		List<Aluno> alunos = alunoService.listaAlunos();
		model.addAttribute("listaAlunos", alunos);

		return "aluno";
	}
}
