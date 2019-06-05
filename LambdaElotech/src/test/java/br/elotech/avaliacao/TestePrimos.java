package br.elotech.avaliacao;

import org.junit.Assert;
import org.junit.Test;

import br.elotech.avaliacao.EloPrimos;

//Implemente um método que retorne os primos menores que um dado número 

public class TestePrimos {

	@Test
	public void testPrimos4() {
		Assert.assertEquals("2,3", EloPrimos.getPrimos(4));
	}

	@Test
	public void testPrimos8() {
		Assert.assertEquals("2,3,5,7", EloPrimos.getPrimos(8));
	}

	@Test
	public void testPrimos20() {
		Assert.assertEquals("2,3,5,7,11,13,17,19", EloPrimos.getPrimos(20));
	}

}
