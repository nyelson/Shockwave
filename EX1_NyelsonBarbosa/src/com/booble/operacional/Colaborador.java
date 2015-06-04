package com.booble.operacional;
/*
 * 3. [1,0] Crie a classe, n�o execut�vel,
 *  "Colaborador". Esta classe representa um
 *  funcion�rio de uma empresa.
 *  Um funcion�rio deve possuir nome,
 *  matr�cula, idade, sexo, tipo de contrato
 *  e carga hor�ria
 *  (quantas horas por semana ele trabalha).
 *  O tipo de contrato � representado por um
 *  n�mero que deve ser 1, 2 ou 3
 *  (1 = Gerente, 2 = L�der de Equipe,
 *  3 = Estagi�rio). Crie tamb�m TODOS os
 *  m�todos que julgar necess�rio.
 *  Esta classe deve ficar no
 *  "pacote com.booble.operacional"
 */

public class Colaborador {
	
	private String nome;
	private int matricula;
	private int idade;
	private String sexo;
	private int tipo_de_contrato;
	private int carga_horaria;
	
	private void validarIdade(int idade){
		if(idade > 0){
			this.idade = idade;
		}
	}
	
	private void validarTipoDeContrato(int tipo_de_contrato){
		if(tipo_de_contrato >= 1 && tipo_de_contrato <= 3){
			this.tipo_de_contrato = tipo_de_contrato;
		}
	}
	
	
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
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		validarIdade(idade);
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
		validarTipoDeContrato(tipo_de_contrato);
	}
	public int getCarga_horaria() {
		return carga_horaria;
	}
	public void setCarga_horaria(int carga_horaria) {
		this.carga_horaria = carga_horaria;
	}	
	

}
