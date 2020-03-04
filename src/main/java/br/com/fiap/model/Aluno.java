package br.com.fiap.model;

public class Aluno {
	private Integer rm;
	private String nome;
	private Double nota;
	private boolean passou;
	
	public Aluno(Integer rm, String nome, Double nota) {
		this.nome = nome;
		this.nota = nota;
		this.rm = rm;
		
		passou = nota >= 7;
	}
	
	public Integer getRm() {
		return rm;
	}
	public void setRm(Integer rm) {
		this.rm = rm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}
	
	public boolean getPassou() {
		return this.passou;
	}
	
	

}
