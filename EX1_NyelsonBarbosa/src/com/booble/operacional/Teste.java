package com.booble.operacional;

/*
 * 8. [3,5] Crie uma classe executável. Ela deve realizar as seguintes operações:

* Exibir o estado da empresa através do método "exibirStatus" da classe RH.

* Cadastrar, utilizando o método criado (você pode inventar os valores e digitá-los diretamente no código),
*  3 colaboradores na empresa.

* Percorrer o vetor de colaboradores e, para CADA colaborador, exibir na tela o nome do colaborador e seu salário.
*  O nome deve ser obtido diretamente do objeto (p. ex. um "getter").
*   O salário deve ser calculado através da multiplicação da carga horária de um colaborador pelo
RETORNO do método "determinarPagamento".

* Você NÃO pode instanciar nenhum objeto do tipo RH.

* Exibir o estado da empresa através do método "exibirStatus" da classe RH.
 */

import com.booble.adm.RH;

public class Teste {
	
	//private final static int NUMERO_DE_COLABORADORES = 3;

	public static void main(String[] args) {
		
		FolhaDePagamento colaboradores = new FolhaDePagamento();
		Colaborador[] listadeColaboradores = colaboradores.getVetorColaboladores();
		//FolhaDePagamento[] listadeColaboradores = new FolhaDePagamento[NUMERO_DE_COLABORADORES];
		
		RH.exibirStatus();
		System.out.println(" ");
		
		String nome;
		int matricula;
		int idade;
		String sexo;
		int tipo_de_contrato;
		int carga_horaria;
		int indice = 0;
		
		nome = "Nyelson";
		matricula = 1996;
		idade = 18;
		sexo = "Masculino";
		tipo_de_contrato = 3;
		carga_horaria = 20;
		colaboradores.cadastrarColaborador(indice, nome, matricula, idade, sexo, tipo_de_contrato, carga_horaria);
		indice++;
		
		nome = "Jerusa";
		matricula = 1965;
		idade = 49;
		sexo = "Feminino";
		tipo_de_contrato = 1;
		carga_horaria = 30;
		colaboradores.cadastrarColaborador(indice, nome, matricula, idade, sexo, tipo_de_contrato, carga_horaria);
		indice++;
		
		nome = "Neilson";
		matricula = 1973;
		idade = 40;
		sexo = "Masculino";
		tipo_de_contrato = 2;
		carga_horaria = 25;
		colaboradores.cadastrarColaborador(indice, nome, matricula, idade, sexo, tipo_de_contrato, carga_horaria);
		indice++;
		
		for(Colaborador listarColaborador : listadeColaboradores){
			System.out.println("Nome: " + listarColaborador.getNome());
			System.out.println("Matricula: " + listarColaborador.getMatricula());
			System.out.println("Idade: " + listarColaborador.getIdade());
			System.out.println("Sexo: " + listarColaborador.getSexo());
			System.out.println("Tipo de Contrato: " + listarColaborador.getTipo_de_contrato());
			System.out.println("Carga Horaria: " + listarColaborador.getCarga_horaria());
			System.out.println(" ");
		}
		
		RH.exibirStatus();
		
		
		/*Colaborador colaborador1 = new Colaborador();
		colaborador1.setNome("Nyelson");
		colaborador1.setMatricula(2015);
		colaborador1.setIdade(18);
		colaborador1.setSexo("Masculino");
		colaborador1.setTipo_de_contrato(3);
		colaborador1.setCarga_horaria(20);
		
		
		FolhaDePagamento colaborador2 = new FolhaDePagamento();
		colaborador2.cadastrarColaborador(1, "Jerusa", 2013, 49, "Feminino", 1, 30);
		
		FolhaDePagamento colaborador3 = new FolhaDePagamento();
		colaborador3.cadastrarColaborador(2, "Neilson", 2014, 40, "Masculino", 2, 25);	*/

	}

}
