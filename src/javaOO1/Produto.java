package javaOO1;

public class Produto
{
	//	int contadorDeProdutos;
	static int codigo;
	String nome;
	int quantidade;
	double preco;

	public void mostraPreco() {
		System.out.println(preco);
	}
	
	public void atualizaPreco(double percentual) {
		preco = preco + preco*percentual/100;
	}
	
	
	
	
	
	
	
	
	
}
