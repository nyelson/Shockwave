package com.petshop.lojadeanimais;

import com.petshop.cachorro.Cachorro;

/*
 * 3. Crie a classe, n�o execut�vel, "LojaDeAnimais". Esta classe representa uma loja de animais.
 * Uma loja de animais deve possuir nome, endere�o e um vetor com 5 cachorros.
 * Escolha o pacote mais adequado para esta classe.
 * Crie um m�todo de cadastro de cachorros que recebe os atributos de um cachorro
 * e o �ndice em que ele deve ser inserido. Justifique, com coment�rios nos m�todos e
 * membros de dados da classe a escolha pelos modificadores utilizados.
 */

public class LojaDeAnimais {
	
	private final int NUMERO_DE_CACHORROS = 5;
	private static int contador;
	private static int contadorCachorro = 0;
	
	/*
	 * 4. Crie o m�todo "animalMaisFofo", que deve percorrer o vetor de cachorros e retornar o
	 * elemento que possui o maior valor do atributo "fofura".
	 */
	
	public void animalMaisFofo(Cachorro[] maisFofo){
		
		Cachorro cachorro = new Cachorro();
		
		for(contador = 0; contador < NUMERO_DE_CACHORROS; contador++){
			
			if(maisFofo[contador].getFofura() > cachorro.getFofura()){
				cachorro = maisFofo[contador];

			}		
		}
		System.out.println("Cachorro mais fofo: " + cachorro.getNome());		
	}
	
	public void desvioFofura(Cachorro[] desvio){
		
		int soma = 0;
		double media = 0;
		double varian�a = 0;
		double desvioPadrao = 0;
		double somadasVarian�as = 0;
		double mediaDesvio = 0;
		
		if(contadorCachorro == NUMERO_DE_CACHORROS){
		for(contador = 0; contador < NUMERO_DE_CACHORROS; contador++){
			soma = desvio[contador].getFofura() + soma;	
			}
		
		media = soma / NUMERO_DE_CACHORROS;
		for(contador = 0; contador < NUMERO_DE_CACHORROS; contador++){
			varian�a = desvio[contador].getFofura() - media;
			varian�a = varian�a * varian�a;
			somadasVarian�as += varian�a;
		}
		
		mediaDesvio = somadasVarian�as / NUMERO_DE_CACHORROS;
		
		desvioPadrao = Math.sqrt(mediaDesvio);		
		
		System.out.println("Desvio padrao: " + desvioPadrao);
		System.out.println("Media: " + media);
		}
		
	}
	
	Cachorro[] vetorCachorro = new Cachorro[NUMERO_DE_CACHORROS];
	
	public void cadastrarCachorro(int indiceVetor, String nome, int idade, String sexo, String ra�a, int fofura){
		
		Cachorro cachorros = new Cachorro();
		
		cachorros.setNome(nome);
		cachorros.setIdade(idade);
		cachorros.setSexo(sexo);
		cachorros.setRa�a(ra�a);
		cachorros.setFofura(fofura);
		
		vetorCachorro[indiceVetor] = cachorros;
		contadorCachorro++;		
	}

	public Cachorro[] getVetorCachorro() {
		return vetorCachorro;
	}	

}
