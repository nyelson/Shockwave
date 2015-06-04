package com.petshop.operational;

import com.petshop.cachorro.Cachorro;
import com.petshop.lojadeanimais.LojaDeAnimais;

/*
 * 6. Crie uma classe execut�vel. Ela deve realizar as seguintes opera��es:

* Criar 5 cachorros.
* Cadastrar 5 cachorros na Loja de Animais.
* Listar todos os animais dispon�veis na Loja, utilizando um la�o do tipo "enhanced for".
* Imprimir o nome do cachorro mais fofo, utilizando o m�todo criado na classe LojaDeAnimais.
 */
public abstract class Teste {

	public static void main(String[] args) {
	
		LojaDeAnimais loja = new LojaDeAnimais();

		Cachorro[] listadeCachorros = loja.getVetorCachorro();
		
		String nome;
		int idade;
		String sexo;
		String ra�a;
		int fofura;
		int indice = 0;		
		
		nome = "Bydu";
		idade = 3;
		sexo = "Macho";
		ra�a = "Poodle";
		fofura = 95;
		loja.cadastrarCachorro(indice, nome, idade, sexo, ra�a, fofura);
		indice++;
		
		
		nome = "Akamaru";
		idade = 5;
		sexo = "Macho";
		ra�a = "Husky Siberiano";
		fofura = 100;
		loja.cadastrarCachorro(indice, nome, idade, sexo, ra�a, fofura);
		indice++;
		
		
		nome = "Pepper";
		idade = 2;
		sexo = "Femea";
		ra�a = "Poodle";
		fofura = 85;
		loja.cadastrarCachorro(indice, nome, idade, sexo, ra�a, fofura);
		indice++;
		
		nome = "Spocky";
		idade = 4;
		sexo = "Femea";
		ra�a = "Golden Retriever";
		fofura = 80;
		loja.cadastrarCachorro(indice, nome, idade, sexo, ra�a, fofura);
		indice++;
		
		nome = "Peep";
		idade = 24;
		sexo = "Macho";
		ra�a = "Yorkshire";
		fofura = 90;
		loja.cadastrarCachorro(indice, nome, idade, sexo, ra�a, fofura);
		indice++;
		
		for(Cachorro cachorros : listadeCachorros){
			
			System.out.println("Nome: " + cachorros.getNome());
			System.out.println("Idade: " + cachorros.getIdade());
			System.out.println("Sexo: " + cachorros.getSexo());
			System.out.println("Ra�a: " + cachorros.getRa�a());
			System.out.println("Fofura: " + cachorros.getFofura());
			System.out.println(" ");			
		}		
		
		loja.animalMaisFofo(listadeCachorros);	
		loja.desvioFofura(listadeCachorros);
	}

}
