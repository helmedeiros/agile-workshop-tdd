package br.com.caelum.tdd.exercicio1;

public class CalculadoraDeDezOuVinte implements Calculadora {

	/* (non-Javadoc)
	 * @see br.com.caelum.tdd.exercicio1.Calculadora#calculaPara(br.com.caelum.tdd.exercicio1.Funcionario)
	 */
	@Override
	public double calculaPara(Funcionario funcionario) {
		if(funcionario.getSalarioBase() > 3000.0) {
			return funcionario.getSalarioBase() * 0.8;
		}
		else {
			return funcionario.getSalarioBase() * 0.9;
		}
	}

}
