//import java.util.ArrayList;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import br.com.innvent.queMinina.Treinamento.Treinamento;


public class TreinamentoTests {
	private Treinamento treinamento;
	@Before
	public void setup(){
		treinamento = new Treinamento();
	}
	
	@Test
	public void deveSerPossivelDisponibilizarUmTreinamentoParaVenda(){
		//Tell, don't Ask
		
		treinamento.DisponibilizarParaVenda();
		Assert.assertEquals(true, treinamento.isDisponivelParaVenda());
	}
	//Command Query Separation
	//
	@Test
	public void deveSerPossivelIndisponibilizartreinamentosParaVenda(){
		
		treinamento.DisponibilizarParaVenda();
		treinamento.IndisponibilizarParaVenda();
		Assert.assertEquals(false, treinamento.isDisponivelParaVenda());
	}
	@Test
	public void deveSerPossivelAdicionarPreRequisitoParatreinamento(){
		
		treinamento.adicionarPreRequisito("Conhecimento de OO");
		treinamento.adicionarPreRequisito("Conhecimento basico de uma linguagem de progamacao");
		Assert.assertEquals(2, treinamento.getPreRequisitos().size());
		
		
	}
	
}
