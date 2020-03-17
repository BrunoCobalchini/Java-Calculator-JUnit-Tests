package com.brunocobalchini.logica;

public class PrintsCalculadora {

	public void primeiroNumPrint() {
		System.out.println("Digite o primeiro número!!!");
	}

	public void segundoNumPrint() {
		System.out.println("Digite o segundo número!!!");
	}

	public void operacaoPrint() {
		System.out.println("Escolha a operação!\n 1 para SOMAR \n 2 para SUBTRAIR \n 3 para MULTIPLICAR \n 4 para DIVIDIR ");

	}

	public void resultadoPrint(double resultadoFinal) {
		System.out.println("O resultado é: " + resultadoFinal);
	}	
}
