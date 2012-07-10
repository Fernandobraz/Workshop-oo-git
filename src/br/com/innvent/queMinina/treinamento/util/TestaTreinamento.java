package br.com.innvent.queMinina.treinamento.util;

import br.com.innvent.queMinina.Treinamento.Treinamento;

public class TestaTreinamento {

	
	public static void main(String[] args){
		Treinamento treinamento = new Treinamento();
		treinamento.setNome("WorkShop de 00");
		treinamento.setCargaHoraria(8);
		
		treinamento.DisponibilizarParaVenda();
		treinamento.IndisponibilizarParaVenda();
		treinamento.adicionarPreRequisito("Conhecimentos de Java");
	}
}
