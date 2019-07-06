package javaOO1;

public class ExemploPolimorfismo {
	public static void main(String[] args) {
		Veiculo2 a = new Veiculo2();
		Veiculo3 b = new Veiculo3();
		a.velocidade = 10;
		b.velocidade = 20;
		mostrarVelocidade(a);
		mostrarVelocidade(b);
	}
	
	public static void mostrarVelocidade(Veiculo2 v) {
		System.out.println(v.velocidade);
	}
}