package com.brunocobalchini.model;

import com.brunocobalchini.logica.LogicaCalculadora;
import com.brunocobalchini.logica.PrintsCalculadora;
import java.util.Scanner;

public class AppCalculadora {

	static int operacao = 0;
	static double resultadoFinal = 0;

	public static void main(String[] args) {

		LogicaCalculadora logicaCalculadora = new LogicaCalculadora(); 
		PrintsCalculadora metodosComPrint = new PrintsCalculadora();
		Scanner inputScanner = new Scanner(System.in); 
		metodosComPrint.primeiroNumPrint(); //Aqui � digitado o primeiro numero do c�lculo
		double primeiroOperando = inputScanner.nextInt();
		metodosComPrint.segundoNumPrint(); // Aqui � digitado o segundo n�mero do c�lculo
		double segundoOperando = inputScanner.nextInt();
		metodosComPrint.operacaoPrint(); // Aqui � digitada a operac�o
		operacao = inputScanner.nextInt();
		inputScanner.close(); //Scanner � fechado
		resultadoFinal = logicaCalculadora.calcular(operacao, primeiroOperando, segundoOperando); // Aqui � feito o c�lculo com base na opera��o
		metodosComPrint.resultadoPrint(resultadoFinal); //� imprimido o resultado
	}

}