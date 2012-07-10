package br.com.innvent.queMinina.Treinamento;

import java.util.Calendar;
import java.util.Date;



public class Periodo {
	
	private Calendar dataInicio;
	private Calendar dataFim;
	
	public Periodo(Calendar dateInicio, Calendar dataFim){
		if(dataInicio.after(dataFim)){
			throw new exception("")
		}
		this.dataInicio = dataInicio;
		this.dataInicio = dataInicio;
		//getdate(ver a diferença dos dois)--procurar
	}
	
	public boolean estaSobreposto(Periodo periodo) {
		return!(this.Inicio.after(periodo.Fim) || this.Fim.before(periodo.Fim) && periodo.Inicio.after(this.Fim) || periodo.Fim.before(this.Inicio));
	}

}
