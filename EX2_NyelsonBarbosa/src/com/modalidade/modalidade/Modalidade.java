package com.modalidade.modalidade;

/*
 * 3. Crie a classe, n�o execut�vel, "Modalidade". Esta classe representa o esporte praticado
pelo atleta. Uma modalidade deve possuir nome e sal�rio m�dio . Crie tamb�m TODOS os m�todos
que julgar necess�rio. Escolha o pacote mais adequado para esta classe. Justifique, com
coment�rios nos m�todos e membros de dados da classe a escolha pelos modificadores utilizados.
 */

public class Modalidade {
	
	private final int NUMERO_DE_MODALIDADES = 5;
	
	private String nome;
	private int salario_medio;
	
	Modalidade[] listadeModalidades = new Modalidade[NUMERO_DE_MODALIDADES];
	
	public void cadastrarModalidade(String nome, int salario_medio){
		
			setNome(nome);
			setSalario_medio(salario_medio);
	} 
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getSalario_medio() {
		return salario_medio;
	}
	public void setSalario_medio(int salario_medio) {
		this.salario_medio = salario_medio;
	}

	public Modalidade[] getListadeModalidades() {
		return listadeModalidades;
	}

}
