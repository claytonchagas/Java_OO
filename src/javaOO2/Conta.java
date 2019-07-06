package javaOO2;

public class Conta {
	int numero;
	String nome;
	double saldo;
	double limite;


	boolean sacar(double valor){
		//com variavel auxiliar saldoAlterado
		//		double saldoAlterado = saldo - valor;
		//		saldo = saldoAlterado;
		//		saldo = saldo - valor;
		//		saldo -= valor;
		if ((this.saldo+this.limite) < valor) {
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}

	
	void depositar(double valor) {
		this.saldo += valor;
	}
}