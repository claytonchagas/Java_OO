package javaOO2;

public class ContaClienteConstrutor {
	int numero;
//	String nome;
	Cliente cliente = new Cliente();
	double saldo;
	double limite;
	
	ContaClienteConstrutor(String nome, String cpf){
		this.cliente.nome = nome;
		this.cliente.cpf = cpf;
	}
}