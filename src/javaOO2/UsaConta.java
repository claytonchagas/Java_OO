package javaOO2;

public class UsaConta {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.numero = 01;
		c1.nome = "Robert";
		c1.saldo = 1000.0;
		c1.limite = 500.0;
		
		Conta c2 = new Conta();
		c2.numero = 02;
		c2.nome = "Pedro";
		c2.saldo = 1500.0;
		c2.limite = 1000.0;
		
		System.out.println("Numero da conta: "+c1.numero);
		System.out.println("Titular: "+c1.nome);
		System.out.println("Saldo atual: "+c1.saldo);
		System.out.println("Limite: "+c1.limite);
		
		double valorSaque = 3500;
		boolean resultado = c1.sacar(valorSaque);
		if (resultado) {
			System.out.println("Saldo atualizado: "+c1.saldo);
		} else {
			System.out.println("Saque não efetuado, valor acima do permitido");
		}
		
		c1.depositar(1000);
		System.out.println("Saldo atualizado: "+c1.saldo);
		
		System.out.println("Numero da conta: "+c2.numero);
		System.out.println("Titular: "+c2.nome);
		System.out.println("Saldo atual: "+c2.saldo);
		System.out.println("Limite: "+c2.limite);
	}
}