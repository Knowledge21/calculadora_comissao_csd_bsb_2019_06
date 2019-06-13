package br.com.k21;

public class CalculadoraComissao {

	public static double Calcular(double venda) {
		double resultado = venda * 5 / 100;

		if (venda > 10000)
			resultado = venda * 6 / 100;

		return Math.floor(resultado * 100) / 100;

	}

	public static int Calcular(int venda) {

		if (venda > 10000)
			return venda * 6 / 100;

		return venda * 5 / 100;

	}

}
