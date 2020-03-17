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
		metodosComPrint.primeiroNumPrint(); //Aqui é digitado o primeiro numero do cálculo
		double primeiroOperando = inputScanner.nextInt();
		metodosComPrint.segundoNumPrint(); // Aqui é digitado o segundo número do cálculo
		double segundoOperando = inputScanner.nextInt();
		metodosComPrint.operacaoPrint(); // Aqui é digitada a operacão
		operacao = inputScanner.nextInt();
		inputScanner.close(); //Scanner é fechado
		resultadoFinal = logicaCalculadora.calcular(operacao, primeiroOperando, segundoOperando); // Aqui é feito o cálculo com base na operação
		metodosComPrint.resultadoPrint(resultadoFinal); //É imprimido o resultado
	}

}