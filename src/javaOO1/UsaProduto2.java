package javaOO1;

public class UsaProduto2 {
	@SuppressWarnings("static-access")
	public static void main(String args[]) {
		Produto A = new Produto();
		Produto B;
		@SuppressWarnings("unused")
		Produto C;
		B = new Produto();
		C = new Produto();	
		//	System.out.println(A.codigo +" "+A.nome);	
		A.codigo = 001;
		System.out.println(A.codigo);
		System.out.println(B.codigo);
		B.codigo = 2;
		System.out.println(B.codigo);
		System.out.println(A.codigo);
	}
}