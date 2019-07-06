package javaOO1;

public class Exemplo {
	public static void main(String[] args) {
		Veiculo2 v1;
		v1 = new Veiculo2();
		v1.nome = "Gol";
		System.out.println(v1.nome);
		for (int i = 0; i < 5; i++) {
			v1.acelerar();
			v1.mostrarVelocidade();
		}
	}
}


class Veiculo{
	String nome;
	private float velocidade;
	
	public void acelerar() {
		if (velocidade <= 10) {
			velocidade++;
		}
	}
	
	void frear() {
		if (velocidade > 0) {
			velocidade--;
		}
	}
	
	void mostrarVelocidade() {
		System.out.println(velocidade);
	}
}