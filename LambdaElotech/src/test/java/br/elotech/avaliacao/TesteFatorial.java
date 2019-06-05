package br.elotech.avaliacao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.elotech.avaliacao.EloFatorial;

//Faça um algorítimo que data um número maior que 0 e menor que 10, 
//retorne o seu fatorial usando um procedimento recursivo.

public class TesteFatorial {

	
	private EloFatorial eloFatorial;
	
	@Before
	public void setup() {
		eloFatorial = new EloFatorial();
	}

	@Test
	public void fatorial2() {
		Assert.assertEquals(2, eloFatorial.getFatorial(2));
	}

	@Test
	public void fatorial6() {
		Assert.assertEquals(720, eloFatorial.getFatorial(6));
	}

}
