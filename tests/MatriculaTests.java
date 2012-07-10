import java.util.Calendar;

import org.junit.Test;

import junit.framework.Assert;

import br.com.innvent.queMinina.Treinamento.Aluno;
import br.com.innvent.queMinina.Treinamento.Matricula;
import br.com.innvent.queMinina.Treinamento.Treinamento;
import br.com.innvent.queMinina.Treinamento.Turma;

public class MatriculaTests {
	@Test
	public void deveSerPossivelcriarUmaMatriculaDadoUmAlunoETurma(){
		Treinamento cursoDeJava = new Treinamento();
		cursoDeJava.setNome("Curso de Java");
		Aluno jose = new Aluno("jose", "82528244");
		Turma turma = new Turma(cursoDeJava, Calendar.getInstance(),Calendar.getInstance());
		Matricula matricula = new Matricula(jose, turma);
		Assert.assertNotNull(matricula);
	}
}
