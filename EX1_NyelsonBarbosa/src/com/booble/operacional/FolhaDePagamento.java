package com.booble.operacional;

/*
 * 5. [1,0] Crie a classe, n�o execut�vel,
 * "FolhadePagamento". Esta classe deve ficar
 * no "pacote com.booble.operacional".
 * A Classe folha de pagamento deve possuir ano,
 * m�s e n�mero de s�rie. A vari�vel n�mero
 * de s�rie deve ser acess�vel diretamente da
 * classe, sem a necessidade de um objeto,
 * e representa um identificador da �ltima folha
 * de pagamento gerada. A classe tamb�m deve
 * possuir um vetor de colaboradores, com apenas
 * 3 elementos. Crie tamb�m TODOS os m�todos que
 * julgar necess�rio.
 */

public class FolhaDePagamento {
	
	private final int NUMERO_DE_COLABORADORES = 3;
	private static int contador = 0;
	
	private int ano;
	private int mes;
	private static int numero_de_serie;
	Colaborador[] vetorColaboladores = new Colaborador[NUMERO_DE_COLABORADORES];
	
	/*
	 * 6  [2,0] Crie o m�todo "cadastrarColaborador",
	 * que recebe todos os dados de um colaborador (ver item 3), cria um "Colaborador",
	 * e o coloca no vetor de colaboradores. O �ndice do vetor onde o novo colaborador
	 * deve ser posto tamb�m � recebido pelo m�todo.
	 */
	
	/*
	 * private String nome;
	private int matricula;
	private int idade;
	private String sexo;
	private int tipo_de_contrato;
	private int carga_horaria;
	 */
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public static int getNumero_de_serie() {
		return numero_de_serie;
	}
	public static void setNumero_de_serie(int numero_de_serie) {
		FolhaDePagamento.numero_de_serie = numero_de_serie;
	}
	public Colaborador[] getVetorColaboladores() {
		return vetorColaboladores;
	}
	
	public int getNUMERO_DE_COLABORADORES() {
		return NUMERO_DE_COLABORADORES;
	}
	
	public void cadastrarColaborador(int indice, String nome, int matricula, int idade, String sexo, int tipo_de_contrato, int carga_horaria){
		
		Colaborador colaborador = new Colaborador();
		
		colaborador.setNome(nome);
		colaborador.setMatricula(matricula);
		colaborador.setIdade(idade);
		colaborador.setSexo(sexo);
		colaborador.setTipo_de_contrato(tipo_de_contrato);
		colaborador.setCarga_horaria(carga_horaria);
		
		vetorColaboladores[indice] = colaborador;
		contador++;
	}

}
