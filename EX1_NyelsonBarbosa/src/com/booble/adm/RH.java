package com.booble.adm;

public class RH {
	
	public static void exibirStatus(){
		System.out.println("Iniciando Exibi��o do Status da Empresa");
		System.out.println("BLAH BLAH BLAH");
		System.out.println("Encerrando Exibi��o do Status da Empresa");
	}
	
	/*
	 * * Percorrer o vetor de colaboradores e, para CADA colaborador, exibir na tela o nome do colaborador 
	 * e seu sal�rio.
*  O nome deve ser obtido diretamente do objeto (p. ex. um "getter").
*   O sal�rio deve ser calculado atrav�s da multiplica��o da carga hor�ria de um colaborador pelo
RETORNO do m�todo "determinarPagamento".

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
