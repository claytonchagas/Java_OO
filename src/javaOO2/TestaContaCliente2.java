package javaOO2;

public class TestaContaCliente2 {
	public static void main(String[] args) {
		ContaCliente2 cc2 = new ContaCliente2();
		cc2.cliente.nome = "Maria";
		System.out.println(cc2.cliente.nome);
//		Não dá NullPointerException mesmo com o código
//		igual a TestaContaCliente, pois
//		Cliente teve new em ContaCliente2	
	}
}