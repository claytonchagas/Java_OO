package calculadoraoo;

import java.util.Scanner;

public class CalculadoraInterativa {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		int opcao = 0;
		double num1;
		double num2;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Escolha a operação:");
		System.out.println("Digite 1 para soma");
		System.out.println("Digite 2 para subtração");
		System.out.println("Digite 3 para multiplicação");
		System.out.println("Digite 4 para divisão");
		System.out.println("Digite 0 para sair");
		System.out.println("Operação escolhida: ");
		
		opcao = input.nextInt();
		
		while(opcao != 0) {
			if(opcao == 1) {
				Scanner input1 = new Scanner(System.in);
				System.out.println("Insira o primeiro valor: ");
				num1 = input1.nextDouble();
				System.out.println("Insira o segundo valor: ");
				num2 = input1.nextDouble();
				double resultado = calc.adicao(num1, num2);
				System.out.println(resultado);
				input1.close();
				break;
			}
			
			if(opcao == 2) {
				Scanner input1 = new Scanner(System.in);
				System.out.println("Insira o primeiro valor: ");
				num1 = input1.nextDouble();
				System.out.println("Insira o segundo valor: ");
				num2 = input1.nextDouble();
				double resultado = calc.subtracao(num1, num2);
				System.out.println(resultado);
				input1.close();
				break;
			}
			
			if(opcao == 3) {
				Scanner input1 = new Scanner(System.in);
				System.out.println("Insira o primeiro valor: ");
				num1 = input1.nextDouble();
				System.out.println("Insira o segundo valor: ");
				num2 = input1.nextDouble();
				double resultado = calc.multiplicacao(num1, num2);
				System.out.println(resultado);
				input1.close();
				break;
			}
			
			if(opcao == 4) {
				Scanner input1 = new Scanner(System.in);
				System.out.println("Insira o primeiro valor: ");
				num1 = input1.nextDouble();
				System.out.println("Insira o segundo valor: ");
				num2 = input1.nextDouble();
				double resultado = calc.divisao(num1, num2);
				System.out.println(resultado);
				input1.close();
				break;
			}
			input.close();
		}
	}

}
