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
		System.out.println("Resultado adi��o:"+z);
		System.out.println("Resultado subtra��o:"+k);
		System.out.println("Resultado multiplica��o:"+w);
		System.out.println("Resultado divis�o:"+h);
		System.out.println("Resultado adi��o: "+calc.adicao(x, y));
		
	}

}
