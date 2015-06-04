package com.modalidade.operational;

import com.modalidade.modalidade.*;
import com.modalidade.atleta.*;

/*
 * 4. Crie uma classe executável. Ela deve realizar as seguintes operações:

* Criar um vetor com 5 atletas.
* Cadastrar 5 atletas (crie um método para cadastrar atletas na classe atleta).
* Cadastrar 5 modalidades (crie um método para cadastrar modalidades na classe modalidade).
* Associar as modalidades aos atletas (crie um método para associar modalidades na classe atleta).
* Imprimir as informações de todos os atletas (utilizando enhanced for)
* Imprimir o nome do atleta mais famoso e do atleta com o maior salário médio.
 */

public class Teste {
	
	private final static int NUMERO_DE_ATLETAS = 5;

	public static void main(String[] args) {
		
		Atleta[] atleta = new Atleta[NUMERO_DE_ATLETAS];
		Modalidade[] modalidade = new Modalidade[NUMERO_DE_ATLETAS];
		
		Modalidade modalidade1 = new Modalidade();
		modalidade1.cadastrarModalidade("Natação", 1900);
		modalidade[0] = modalidade1;
		
		Modalidade modalidade2 = new Modalidade();
		modalidade2.cadastrarModalidade("Remo", 1900);
		modalidade[1] = modalidade2;
		
		Modalidade modalidade3 = new Modalidade();
		modalidade3.cadastrarModalidade("Alpinismo", 1900);
		modalidade[2] = modalidade3;
		
		Modalidade modalidade4 = new Modalidade();
		modalidade4.cadastrarModalidade("Ciclismo", 1900);
		modalidade[3] = modalidade4;
		
		Modalidade modalidade5 = new Modalidade();
		modalidade5.cadastrarModalidade("Arco e Flecha", 1900);
		modalidade[4] = modalidade5;
		
		Atleta atleta1 = new Atleta();
		atleta1.cadastrarAtleta("Nyelson", 18, "Masculino", modalidade5, 100);
		atleta[0] = atleta1;
		
		Atleta atleta2 = new Atleta();
		atleta2.cadastrarAtleta("Neilson", 40, "Masculino", modalidade2, 85);
		atleta[1] = atleta2;
		
		Atleta atleta3 = new Atleta();
		atleta3.cadastrarAtleta("Jerusa", 49, "Feminino", modalidade3, 95);
		atleta[2] = atleta3;
		
		Atleta atleta4 = new Atleta();
		atleta4.cadastrarAtleta("Luisa", 16, "Feminino", modalidade4, 90);
		atleta[3] = atleta4;
		
		Atleta atleta5 = new Atleta();
		atleta5.cadastrarAtleta("Ana", 38, "Feminino", modalidade1, 80);
		atleta[4] = atleta5;
		
		for(Atleta listarAtleta: atleta){
			System.out.println("Nome: " + listarAtleta.getNome());
			System.out.println("Idade: " + listarAtleta.getIdade());
			System.out.println("Sexo: " + listarAtleta.getSexo());
			System.out.println("Modalidade: " + listarAtleta.getModalidade().getNome());
			System.out.println("Fama: " + listarAtleta.getFama());
			System.out.println("");
		
			/*if(listarAtleta.getModalidade().getSalario_medio()){
				
			}*/
		}
		
		

	}

}
