package com.modalidade.modalidade;

/*
 * 3. Crie a classe, não executável, "Modalidade". Esta classe representa o esporte praticado
pelo atleta. Uma modalidade deve possuir nome e salário médio . Crie também TODOS os métodos
que julgar necessário. Escolha o pacote mais adequado para esta classe. Justifique, com
comentários nos métodos e membros de dados da classe a escolha pelos modificadores utilizados.
 */

public class Modalidade {
	
	private final int NUMERO_DE_MODALIDADES = 5;
	//private static int contador = 0;
	
	private String nome;
	private int salario_medio;
	
	Modalidade[] listadeModalidades = new Modalidade[NUMERO_DE_MODALIDADES];
	
	public void cadastrarModalidade(String nome, int salario_medio){
		
		//Modalidade modalidade = new Modalidade();
		
		//for(contador = 0; contador < NUMERO_DE_MODALIDADES; contador++){
			
			setNome(nome);
			setSalario_medio(salario_medio);
		
			//listadeModalidades[contador] = modalidade;
		//}
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
