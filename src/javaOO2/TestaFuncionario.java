package javaOO2;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.nome = "Mario";
		f1.salario = 500.0;
		f1.status = "ativo";
		System.out.println(f1.salario);
		f1.bonificacao(50);
		System.out.println(f1.salario);
	}
}