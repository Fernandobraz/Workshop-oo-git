import org.junit.Test;
import org.junit.Assert;


public class CalculadoraTeste {
	@Test
	public void deveRetornarUmNumero20NaSomaDe10E10(){
		
		Calculadora c = new Calculadora();
		int valorDaSoma = c.somar(10,10);
		Assert.assertEquals(20, valorDaSoma);
		
	}
	@Test
	public void deveRetornar4QuandoMultiplicar2E2(){
		Calculadora c = new Calculadora();
		Assert.assertEquals(4, c.multiplicar(2,2));
		
	}
	@Test
	public void deveRetornar10QuandoMultiplicar2E5(){
		Calculadora c = new Calculadora();
		Assert.assertEquals(10, c.multiplicar(2,5));
		
	}
}
