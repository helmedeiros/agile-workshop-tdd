package br.com.caelum.tdd.exercicio1;

public class CalculadoraQuinzeOuVinteCincoPorcentoGerente implements Calculadora { 

	public double calculaPara(Funcionario funcionario) {
		if(funcionario.getSalarioBase() >= 5000.0) {
			return funcionario.getSalarioBase() * 0.80;
		}
		else {
			return funcionario.getSalarioBase() * 0.85;
		}
	}

}
