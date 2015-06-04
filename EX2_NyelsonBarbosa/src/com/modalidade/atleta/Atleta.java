package com.modalidade.atleta;

import com.modalidade.modalidade.Modalidade;

/*
 * 2. Crie a classe, não executável, "Atleta". Esta classe representa um atleta profissional.
Um Atleta deve possuir nome, idade, sexo, modalidade e fama. A modalidade é representada
por um OBJETO do tipo "Modalidade". Crie também TODOS os métodos que julgar necessário.
Escolha o pacote mais adequado para esta classe. Justifique, com comentários nos métodos
e membros de dados da classe a escolha pelos modificadores utilizados.
 */

public class Atleta {
	
	private final int NUMERO_DE_ATLETAS = 5;
	private static int contador = 0;
	
	private String nome;
	private int idade;
	private String sexo;
	Modalidade modalidade = new Modalidade();
	private int fama;
	
	private void validarIdade(int idade){
		if(idade > 0){
			this.idade = idade;
		}
	}	
	
	Atleta[] listadeAtletas = new Atleta[NUMERO_DE_ATLETAS];
	
	public void cadastrarAtleta(String nome, int idade, String sexo, Modalidade modalidade, int fama){		
		
		setNome(nome);
		setIdade(idade);
		setSexo(sexo);
		setModalidade(modalidade);
		setFama(fama);
		
	}
	
	public void associarModalidade(Atleta[] listadeAtletas, Modalidade[] listadeModalidades){
		
		Atleta associarAtleta = new Atleta();
		Modalidade associarModalidade = new Modalidade();
		
		//Atleta[] atletas = new Atleta[NUMERO_DE_ATLETAS];
		
		associarAtleta.getListadeAtletas();
		associarModalidade.getListadeModalidades();
		
		for(contador = 0; contador < NUMERO_DE_ATLETAS; contador++){
			associarAtleta.setModalidade(associarModalidade);
			associarAtleta.getModalidade().getNome();
			
			/*if(associarAtleta.getModalidade().equals(associarModalidade.getNome())){
				
			}*/
		}
		
		/*Atleta associarAtleta = new Atleta();
		Modalidade associarModalidade = new Modalidade();
		
		Atleta[] associarAtleta = new Atleta[NUMERO_DE_ATLETAS];
		associarModalidade(this.listadeAtletas, listadeModalidades);*/
		
			
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
	public int getFama() {
		return fama;
	}
	public void setFama(int fama) {
		this.fama = fama;
	}

	public Modalidade getModalidade() {
		return modalidade;
	}

	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}
	
	public Atleta[] getListadeAtletas() {
		return listadeAtletas;
	}	

}
