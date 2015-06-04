package com.booble.adm;

public class RH {
	
	public static void exibirStatus(){
		System.out.println("Iniciando Exibição do Status da Empresa");
		System.out.println("BLAH BLAH BLAH");
		System.out.println("Encerrando Exibição do Status da Empresa");
	}
	
	/*
	 * * Percorrer o vetor de colaboradores e, para CADA colaborador, exibir na tela o nome do colaborador 
	 * e seu salário.
*  O nome deve ser obtido diretamente do objeto (p. ex. um "getter").
*   O salário deve ser calculado através da multiplicação da carga horária de um colaborador pelo
RETORNO do método "determinarPagamento".

	 */

	public static int determinarPagamento(int tipoDeContrato){
		int valor = 0;

		switch(tipoDeContrato){
			case 1:
			valor = 50;
			break;

			case 2:
			valor = 20;
			break;

			default:
			valor = 10;
		}

		return valor;
	}

}
