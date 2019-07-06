package javaOO2;

public class Funcionario {
	String nome;
	String cpf;
	String departamento;
	double salario;
	String status;
	
	void bonificacao(double bonus) {
		this.salario += bonus;
	}
}