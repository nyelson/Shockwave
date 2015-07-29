package com.booble.operational;

public abstract class Colaborador {
	
	protected String nome;
	protected int matricula;
	protected String sexo;
	protected int tipo_de_contrato;
	protected int carga_horario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getTipo_de_contrato() {
		return tipo_de_contrato;
	}
	public void setTipo_de_contrato(int tipo_de_contrato) {
		this.tipo_de_contrato = tipo_de_contrato;
	}
	public int getCarga_horario() {
		return carga_horario;
	}
	public void setCarga_horario(int carga_horario) {
		this.carga_horario = carga_horario;
	}
} 
