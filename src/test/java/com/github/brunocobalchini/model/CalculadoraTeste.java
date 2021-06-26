package com.github.brunocobalchini.model;

import org.junit.Test;

import com.brunocobalchini.logica.LogicaCalculadora;

public class CalculadoraTeste { // FALTA FAZER EXCEPTION PARA EVITAR O USO NÚMEROS ACIMA DA CAPACIDADE DO DOUBLE
								// E DE LETRAS
	double segundoOperando = 0; // Informa o primeiro número para a cálculadora
	double primeiroOperando = 0; // Informa o segundo número para a cálculadora
	double operacao = 1; // INFORMAR NO logicaCalc: 1 = ADICAO, 2 = SUBTRACAO, 3 = MULTIPLICACAO, 4 =
							// DIVISAO

	@Test
	public void verificaCalculadoraAdicao() {
		LogicaCalculadora logicaCalc = new LogicaCalculadora();
		segundoOperando = -1;
		primeiroOperando = -1;
		operacao = 1;
		logicaCalc.calcular(operacao, primeiroOperando, segundoOperando);
		System.out.println("ADICAO: " + logicaCalc.calcular(operacao, primeiroOperando, segundoOperando));
	}

	@Test
	public void verificaCalculadoraSubtracao() { // Está dando -1, ERRADO para nós, certo para o Java
		LogicaCalculadora logicaCalc = new LogicaCalculadora();
		segundoOperando = 1;
		primeiroOperando = 0;
		operacao = 2;
		logicaCalc.calcular(operacao, primeiroOperando, segundoOperando);
		System.out.println("SUBTRACAO: " + logicaCalc.calcular(operacao, primeiroOperando, segundoOperando));
	}

	@Test
	public void verificaCalculadoraMultiplicacao() {
		LogicaCalculadora logicaCalc = new LogicaCalculadora();
		segundoOperando = -1;
		primeiroOperando = -1;
		operacao = 3;
		logicaCalc.calcular(operacao, primeiroOperando, segundoOperando);
		System.out.println("MULTIPLICACAO: " + logicaCalc.calcular(operacao, primeiroOperando, segundoOperando));
	}

	@Test
	public void verificaCalculadoraDivisao() {
		LogicaCalculadora logicaCalc = new LogicaCalculadora();
		segundoOperando = 1;
		primeiroOperando = 1;
		operacao = 4;
		logicaCalc.calcular(operacao, primeiroOperando, segundoOperando);
		System.out.println("DIVISAO: " + logicaCalc.calcular(operacao, primeiroOperando, segundoOperando));
	}

	@Test
	public void verificaOperacao() { // Se der = 0, é que está certo. Na classe LogicaCalculadora tem um else if para
										// este caso!!
		LogicaCalculadora logicaCalc = new LogicaCalculadora();
		operacao = 3434;
		segundoOperando = 1;
		primeiroOperando = 1;
		logicaCalc.calcular(operacao, primeiroOperando, segundoOperando);
		System.out.println("OPERACAO: " + logicaCalc.calcular(operacao, primeiroOperando, segundoOperando));
	}

}