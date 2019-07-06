package javaOO1;

public class UsaProduto {
	@SuppressWarnings("static-access")
	public static void main(String args[]) {
	Produto A = new Produto();
	Produto B;
	@SuppressWarnings("unused")
	Produto C;
	B = new Produto();
	C = new Produto();	
	System.out.println(A.codigo +" "+A.nome);	
	A.codigo = 001;
	A.nome = "Sabonete";
	A.preco = 2.00;
	B.preco = 3.00;
	A.mostraPreco();
	B.mostraPreco();
	B.atualizaPreco(10);
	B.mostraPreco();
	System.out.println(A.codigo +" "+A.nome);
	
	
	
	
	
	
	
	
	
	
	
	}
}