package javaOO1;

public class Veiculo2 {
	String nome;
	float velocidade;
	
	public void acelerar() {
		if (velocidade <= 10) {
			velocidade++;
		}
	}
	
	public void frear() {
		if (velocidade > 0) {
			velocidade--;
		}
	}

	public void mostrarVelocidade() {
		// TODO Auto-generated method stub
		
	}
}