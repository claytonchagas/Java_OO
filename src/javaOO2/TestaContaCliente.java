package javaOO2;

public class TestaContaCliente {
	public static void main(String[] args) {
		ContaCliente cc1 = new ContaCliente();
		cc1.cliente.nome = "Maria";
		System.out.println(cc1.cliente.nome);
//		Dá NullPointerException
//		Isso ocorre pq apesar de ContaCliente
//		ter um Cliente, ele não foi instanciado
	}
}