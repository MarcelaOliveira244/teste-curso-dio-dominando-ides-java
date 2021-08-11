package br.com.dio;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a, b;
		
		System.out.println("Digite o primeiro valor:");
		a = s.nextInt();
		System.out.println("Digite o segundo valor:");
		b = s.nextInt();
		
		int soma = soma(a,b);
		int subtrair = subtrair(a, b);
		int mult = multiplicacao(a, b);
		int sub = dividir(a, b);
		
		System.out.println(soma);
		System.out.println(subtrair);
		System.out.println(mult);
		System.out.println(sub);

	    
	}
	
	public static int soma(int a, int b) {
		return a + b;
	}
	
	public static int subtrair(int a, int b) {
		return a - b;
	}
	
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
	
	public static int dividir(int a, int b) {
		return a / b;
	}

}
