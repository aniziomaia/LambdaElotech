package br.elotech.avaliacao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.elotech.avaliacao.EloPalavraInvertida;


//Faça um algorítimo que data uma palavra, retorne 
// esta palavra invertida.
//Ex: alo = ola

public class TestePalavraInvertida {
	
	private EloPalavraInvertida eloPalavraInvertida;

	public EloPalavraInvertida getEloPalavraInvertida() {
		return new EloPalavraInvertida();
	}
	
	@Before
	public void setup() {
		 this.eloPalavraInvertida = new EloPalavraInvertida();
	}
	
	@Test
	public void testAlo() {
		Assert.assertEquals("ola", eloPalavraInvertida.invertePalavra("alo"));
	}
	
	@Test
	public void testJava() {
		Assert.assertEquals("avaj", eloPalavraInvertida.invertePalavra("java"));
	}
	
}
