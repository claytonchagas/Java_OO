package javaOO1;

public class UsaCliente {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Joao");
		@SuppressWarnings("unused")
		Cliente c2 = new Cliente("Maria");
		System.out.println(c1.nome);
		System.out.println(c1.cidade);
	}
}