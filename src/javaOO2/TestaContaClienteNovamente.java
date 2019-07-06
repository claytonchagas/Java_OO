package javaOO2;

public class TestaContaClienteNovamente {
	public static void main(String[] args) {
		ContaCliente cc1 = new ContaCliente();
		Cliente cl1 = new Cliente();
		cc1.cliente = cl1;
		cc1.cliente.nome = "Maria";
		System.out.println(cc1.cliente.nome);
//		Agora funciona, pois Cliente de cc1
//		foi realmente instanciado
	}
}