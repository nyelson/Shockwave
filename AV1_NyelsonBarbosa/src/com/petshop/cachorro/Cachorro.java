package com.petshop.cachorro;

/*
 * 2. Crie a classe, n�o execut�vel, "Cachorro". Esta classe representa um animal de estima��o.
 * Um cachorro deve possuir nome, idade, sexo, ra�a e fofura. A fofura � representada
por um inteiro e oscila entre 0 e 100. Escolha o pacote mais adequado para esta classe.
Justifique, com coment�rios nos m�todos e membros de dados da classe a escolha pelos modificadores utilizados.
 */
public class Cachorro {
	
	private String nome;
	private int idade;
	private String sexo;
	private String ra�a;
	private int fofura;
	
	private void validarFofura(int fofura){
		if(fofura >= 0 && (fofura <= 100)){			
			this.fofura = fofura;
		}
		
	}
	
	private void validarIdade(int idade){
		if(idade > 0){
			this.idade = idade;
		}
	
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	public String getRa�a() {
		return ra�a;
	}
	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
	}
	public int getFofura() {
		return fofura;
	}

	public void setFofura(int fofura) {
		validarFofura(fofura);
	}

}
