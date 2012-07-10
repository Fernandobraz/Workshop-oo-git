import java.util.Calendar;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import br.com.innvent.queMinina.Treinamento.Aluno;
import br.com.innvent.queMinina.Treinamento.Treinamento;
import br.com.innvent.queMinina.Treinamento.Turma;
import br.com.innvent.queMinina.Treinamento.Periodo;


public class TurmaTests {
	private Calendar dataInicio = Calendar.getInstance();
	private Calendar dataFim = Calendar.getInstance();
	private Treinamento cursoDeJava = new Treinamento();
	
	@Before
	public void setUp(){
		
		dataInicio.set(Calendar.DAY_OF_MONTH,1);
		dataInicio.set(Calendar.MONTH,1);
		dataInicio.set(Calendar.YEAR,2012);
		
		dataFim.set(Calendar.DAY_OF_MONTH,10);
		dataFim.set(Calendar.MONTH,1);
		dataFim.set(Calendar.YEAR,2012);
		
		
		cursoDeJava.setNome("Curso Java");
	}
	
	@Test
	public void deveSerPossivelCriarUmaTurma(){
		Turma turma = new Turma(cursoDeJava,dataInicio,dataFim);
		Assert.assertNotNull(turma);
		
	}
	@Test
	public void naoDeveSerPossivelSobreporTurmas(){
		Turma primeiraTurma = new Turma(cursoDeJava, dataInicio, dataFim);
		Turma outraTurma = new Turma(cursoDeJava, dataInicio, dataFim);
		
		Assert.assertTrue(primeiraTurma.estaSobreposto(outraTurma));
		
	}
	@Test
	public void DeveSerPossivelDefinirQuantidadeMaximaDeAlunos(){
		Turma turma = new Turma(cursoDeJava, dataInicio, dataFim);
		turma.definirQuantidadeMaximaDeAlunos(10);
		Assert.assertEquals(10, turma.getQuantidadeMaximaDeAlunos());
	}

	@Test
	public void DeveSerPossivelMatricularAlunoNaTurma(){
		Aluno jose = new Aluno("jose", "88278827389");
		Turma turma = new Turma(cursoDeJava, dataInicio, dataFim);
		turma.matricular(jose);
		Assert.assertEquals(1,turma.quantidadeDeAlunos());
		
	}
	@Test(expected = IllegalStateException.class)
	public void naoDeveSerPossivelmatricularUmAlunoCasoAQuantidadeMaximaSejaUltrapassada(){
		Aluno jose = new Aluno("jose", "88278827389");
		Aluno paulim = new Aluno("paulim", "647464064");
		Aluno maria = new Aluno("maria", "48464046400");
		
		Turma turma = new Turma(cursoDeJava, dataInicio, dataFim);
		turma.definirQuantidadeMaximaDeAlunos(2);
		turma.matricular(jose);
		turma.matricular(paulim);
		turma.matricular(maria);
	}
	
	@Test
	public void naoDeveChecarQuantidadeMaximaCasoEstaNaoForDefinida(){
		Aluno jose = new Aluno("jose", "88278827389");
		Aluno paulim = new Aluno("paulim", "647464064");
		Aluno maria = new Aluno("maria", "48464046400");
		
		Turma turma = new Turma(cursoDeJava, dataInicio, dataFim);
		turma.matricular(jose);
		turma.matricular(paulim);
		turma.matricular(maria);
	}
	
}
