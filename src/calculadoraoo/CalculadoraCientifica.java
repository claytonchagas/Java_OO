package calculadoraoo;

public class CalculadoraCientifica extends Calculadora{
	public double raiz(double x){
		double y = Math.sqrt(x);
		return y;
	}
	
	public double potencia(double a, double b){
		double y = Math.pow(a, b);
		return y;
	}
}