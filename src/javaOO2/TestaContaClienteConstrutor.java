package javaOO2;

public class TestaContaClienteConstrutor {
	public static void main(String[] args) {
//		ContaClienteConstrutor ccc1 = new ContaClienteConstrutor();
//		A linha acima não funciona, te obriga a utilizar a inicialização
//		prevista no construtor da classe ContaClienteConstrutor
		ContaClienteConstrutor ccc1 = new ContaClienteConstrutor("Joao", "123.456.789-10");
		System.out.println(ccc1.cliente.nome);
		System.out.println(ccc1.cliente.cpf);
	}
}