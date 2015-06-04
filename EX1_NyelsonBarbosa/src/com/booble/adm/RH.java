package com.booble.adm;

public class RH {
	
	public static void exibirStatus(){
		System.out.println("Iniciando Exibição do Status da Empresa");
		System.out.println("BLAH BLAH BLAH");
		System.out.println("Encerrando Exibição do Status da Empresa");
	}

	public int determinarPagamento(int tipoDeContrato){
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
