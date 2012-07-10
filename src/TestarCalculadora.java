
public class TestarCalculadora {
	public static void main(String[] args){
		
	
		Calculadora c = new Calculadora();
		int valorDaSoma = c.somar(10,10);
		if (valorDaSoma == 20){
		System.out.println("esta certo");
		}else{
			System.out.println("esta errado");
		}
	}
}
