package javaOO2;

public class UsaConta2 {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.limite = 100;
		System.out.println("limite de c1: "+c1.limite);
		
		Conta c2;
		c2 = c1;
		c2.limite = 200;
		System.out.println("limite de c2: "+c2.limite);
		System.out.println("limite de c1: "+c1.limite);
	}
}