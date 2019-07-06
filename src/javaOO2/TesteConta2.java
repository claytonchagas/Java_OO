package javaOO2;

public class TesteConta2 {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.nome = "Clayton";
		
		Conta c2 = new Conta();
		c2.nome = "Clayton";
		
		if (c1 == c2) {
			System.out.println("As contas s�o iguais");
		} else {
			System.out.println("As contas s�o diferentes");
		}
	}
}