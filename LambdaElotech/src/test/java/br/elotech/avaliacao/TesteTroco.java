package br.elotech.avaliacao;

import org.junit.Assert;
import org.junit.Test;

import br.elotech.avaliacao.EloTroco;

//Considerando notas de R$ 100, R$ 50, R$ 20, R$ 10, R$ 5, R$ 2 e R$ 1.
//Faça uma rotina que calcule o troco referente a um valor inteiro qualquer. 
//Levando-se em conta que as notas de maior valor devem ser prioridade para o troco.
//Se possível resolva utilizando recursividade.

public class TesteTroco {

	@Test
	public void troco87() {
		Assert.assertEquals("50,20,10,5,2", EloTroco.getTroco(87));
	}

	@Test
	public void troco101() {
		Assert.assertEquals("100,1", EloTroco.getTroco(101));
	}

	@Test
	public void troco153() {
		Assert.assertEquals("100,50,2,1", EloTroco.getTroco(153));
	}
	
	@Test
	public void troco201() {
		Assert.assertEquals("100,100,1", EloTroco.getTroco(201));

	}
}
