package com.petshop.operational;

import com.petshop.cachorro.Cachorro;
import com.petshop.lojadeanimais.LojaDeAnimais;

/*
 * 6. Crie uma classe executável. Ela deve realizar as seguintes operações:

* Criar 5 cachorros.
* Cadastrar 5 cachorros na Loja de Animais.
* Listar todos os animais disponíveis na Loja, utilizando um laço do tipo "enhanced for".
* Imprimir o nome do cachorro mais fofo, utilizando o método criado na classe LojaDeAnimais.
 */
public abstract class Teste {

	public static void main(String[] args) {
	
		LojaDeAnimais loja = new LojaDeAnimais();

		Cachorro[] listadeCachorros = loja.getVetorCachorro();
		
		String nome;
		int idade;
		String sexo;
		String raça;
		int fofura;
		int indice = 0;		
		
		nome = "Bydu";
		idade = 3;
		sexo = "Macho";
		raça = "Poodle";
		fofura = 95;
		loja.cadastrarCachorro(indice, nome, idade, sexo, raça, fofura);
		indice++;
		
		
		nome = "Akamaru";
		idade = 5;
		sexo = "Macho";
		raça = "Husky Siberiano";
		fofura = 100;
		loja.cadastrarCachorro(indice, nome, idade, sexo, raça, fofura);
		indice++;
		
		
		nome = "Pepper";
		idade = 2;
		sexo = "Femea";
		raça = "Poodle";
		fofura = 85;
		loja.cadastrarCachorro(indice, nome, idade, sexo, raça, fofura);
		indice++;
		
		nome = "Spocky";
		idade = 4;
		sexo = "Femea";
		raça = "Golden Retriever";
		fofura = 80;
		loja.cadastrarCachorro(indice, nome, idade, sexo, raça, fofura);
		indice++;
		
		nome = "Peep";
		idade = 24;
		sexo = "Macho";
		raça = "Yorkshire";
		fofura = 90;
		loja.cadastrarCachorro(indice, nome, idade, sexo, raça, fofura);
		indice++;
		
		for(Cachorro cachorros : listadeCachorros){
			
			System.out.println("Nome: " + cachorros.getNome());
			System.out.println("Idade: " + cachorros.getIdade());
			System.out.println("Sexo: " + cachorros.getSexo());
			System.out.println("Raça: " + cachorros.getRaça());
			System.out.println("Fofura: " + cachorros.getFofura());
			System.out.println(" ");			
		}		
		
		loja.animalMaisFofo(listadeCachorros);	
		loja.desvioFofura(listadeCachorros);
	}

}
