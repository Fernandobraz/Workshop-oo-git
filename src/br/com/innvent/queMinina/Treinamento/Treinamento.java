package br.com.innvent.queMinina.Treinamento;

import java.util.ArrayList;
import java.util.List;



public class Treinamento {

	private boolean disponivelParaVenda;
	private String nome;
	private int cargaHoraria;
	private double preco;
	private List<String> preRequisitos;
	
	public Treinamento(){
		this.preRequisitos = new ArrayList<String>();
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public List<String> getPreRequisitos() {
		return preRequisitos;
	}

	public void setPreRequisitos(List<String> preRequisitos) {
		this.preRequisitos = preRequisitos;
	}

	public void setDisponivelParaVenda(boolean disponivelParaVenda) {
		this.disponivelParaVenda = disponivelParaVenda;
	}

	public void DisponibilizarParaVenda() {
		this.disponivelParaVenda = true;
		
	}

	public boolean isDisponivelParaVenda() {
		return this.disponivelParaVenda;
	}

	public void IndisponibilizarParaVenda() {
		this.disponivelParaVenda = false;
		
	}

	public void adicionarPreRequisito(String preRequisito) {
		this.preRequisitos.add(preRequisito);
		
	}

}
