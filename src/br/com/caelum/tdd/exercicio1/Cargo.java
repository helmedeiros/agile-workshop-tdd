package br.com.caelum.tdd.exercicio1;

public enum Cargo {
	DESENVOLVEDOR(new CalculadoraDeDezOuVinte()),
	DBA(new CalculadoraQuinzeOuVinteCincoPorcento()),
	TESTER(new CalculadoraQuinzeOuVinteCincoPorcento()),
	GERENTE_DE_PROJETOS(new CalculadoraQuinzeOuVinteCincoPorcentoGerente());
	
	private final Calculadora calculadora;

	private Cargo(Calculadora calculadora) {
		this.calculadora = calculadora;
	}

	public Calculadora getCalculadora() {
		return calculadora;
	}
	
	
}
