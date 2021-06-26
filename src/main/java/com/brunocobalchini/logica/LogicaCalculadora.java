package com.brunocobalchini.logica;

public class LogicaCalculadora {

	public double calcular(double operacao, double primeiroOperando, double segundoOperando) {

		double resultado = 0;

		if (operacao == 1) {
			resultado = primeiroOperando + segundoOperando;
		} else if (operacao == 2) {
			resultado = primeiroOperando - segundoOperando;
		} else if (operacao == 3) {
			resultado = primeiroOperando * segundoOperando;
		} else if (operacao == 4) {
			resultado = primeiroOperando / segundoOperando;
		} else {
			resultado = 0;
		}

		return resultado;
	}
}