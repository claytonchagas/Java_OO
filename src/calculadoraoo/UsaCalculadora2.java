package calculadoraoo;

public class UsaCalculadora2 {
	public static void main(String[] args) {
		CalculadoraCientifica calcc  =new CalculadoraCientifica();
		double x = calcc.adicao(10, 20);
		double y = calcc.potencia(2, 3);
		
		System.out.println("Resultado adição: "+x);
		System.out.println("Resultado potência: "+y);
		System.out.println("Resultado raiz: "+calcc.raiz(9));
	}
}