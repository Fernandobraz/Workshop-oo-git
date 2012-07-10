package br.com.innvent.queMinina.Treinamento;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;



public class Turma {

	private int QuantidadeMaximaDeAlunos;
	private Treinamento treinamento;
	private List<Aluno> alunos;
	private Periodo periodo;

	public Turma(Treinamento treinamento, Calendar dataInicio, Calendar dataFim) {
		this.treinamento = treinamento;
		this.alunos = new ArrayList<Aluno>();
		this.periodo = new Periodo(dataInicio, dataFim);
	}
	public int getQuantidadeMaximaDeAlunos() {
		return this.QuantidadeMaximaDeAlunos;
	}
	public boolean estaSobreposto(Turma outraTurma){
		return this.periodo.estaSobreposto(outraTurma.getPeriodo());
	}
	


	public void definirQuantidadeMaximaDeAlunos(int quantidade) {
		this.QuantidadeMaximaDeAlunos = quantidade;
		
	}
	
	public Matricula matricular(Aluno aluno){
		if(this.haVagas()){
		Matricula matricula = new Matricula(aluno,this,this.treinamento.getPreco());
			this.alunos.add(aluno);
			return matricula;
		}else{
			throw new IllegalStateException("Quantidade máxima atingida");
		}
	}
	private boolean haVagas() {
		return this.quantidadeDeAlunos() < this.QuantidadeMaximaDeAlunos || this.QuantidadeMaximaDeAlunos == 0;
	}
	public int quantidadeDeAlunos(){
		return this.alunos.size();
	}
	private Periodo getPeriodo() {
		return this.periodo;
	}

}
