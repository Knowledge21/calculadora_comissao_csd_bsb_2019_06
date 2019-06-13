package br.com.k21;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculadoraComissao {

	@Test
	public void UmaVendaDe500Reais() {
		int venda = 500;
		int valorEsperado = 25;

		int retorno = CalculadoraComissao.Calcular(venda);

		Assert.assertEquals(valorEsperado, retorno);
	}

	@Test
	public void UmaVendaDe5000Reais() {
		int venda = 5000;
		int valorEsperado = 250;

		int retorno = CalculadoraComissao.Calcular(venda);

		Assert.assertEquals(valorEsperado, retorno);
	}

	@Test
	public void UmaVendaDe20000Reais() {
		int venda = 20000;
		int valorEsperado = 1200;
		int retorno = CalculadoraComissao.Calcular(venda);

		Assert.assertEquals(valorEsperado, retorno);
	}

	@Test
	public void UmaVendaDe10000ReaisRetorne5porCentoDoValor() {
		int venda = 10000;
		int valorEsperado = 500;
		int retorno = CalculadoraComissao.Calcular(venda);

		Assert.assertEquals(valorEsperado, retorno);
	}

	@Test
	public void UmaVendaDe11000ReaisRetorne6porCentoDoValor() {
		int venda = 11000;
		int valorEsperado = 660;
		int retorno = CalculadoraComissao.Calcular(venda);

		Assert.assertEquals(valorEsperado, retorno);
	}

	@Test
	public void UmaVendaDe0ReaisRetorne6porCentoDoValor() {
		int venda = 0;
		int valorEsperado = 0;
		int retorno = CalculadoraComissao.Calcular(venda);

		Assert.assertEquals(valorEsperado, retorno);
	}

	@Test
	public void UmaVendaDe10001ReaisRetorne6porCentoDoValor() {
		double venda = 10001;
		double valorEsperado = 600.06;
		double retorno = CalculadoraComissao.Calcular(venda);

		Assert.assertEquals(valorEsperado, retorno, 0);
	}

	@Test
	public void UmaVendaDe55E59ReaisRetorne5porCentoDoValor() {
		double venda = 55.59;
		double valorEsperado = 2.77;
		double retorno = CalculadoraComissao.Calcular(venda);

		Assert.assertEquals(valorEsperado, retorno, 0);
	}
}