package calculadoraoo;

public class UsaCalculadora {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		double x = 10;
		double y = 20;
		double z, k, w, h;
		z = calc.adicao(x, y);
		k = calc.subtracao(x, y);
		w = calc.multiplicacao(x, y);
		h = calc.divisao(x, y);
		System.out.println("Resultado adição:"+z);
		System.out.println("Resultado subtração:"+k);
		System.out.println("Resultado multiplicação:"+w);
		System.out.println("Resultado divisão:"+h);
		System.out.println("Resultado adição: "+calc.adicao(x, y));
		
	}

}
