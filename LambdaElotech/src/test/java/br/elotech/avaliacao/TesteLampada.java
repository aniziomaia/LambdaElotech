package br.elotech.avaliacao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

//Faça uma classe que simule o comportamento de uma lâmpada com métodos ligar, 
//desligar e verificar se está ligado.
//Construa os testes necessários

public class TesteLampada {
	
	@Before
	public void setup() {
	}

	@Test
	public void acende() {
		Assert.assertTrue("true",EloLampada.acenderLampada("acessa"));
	}

	@Test
	public void apaga() {
		Assert.assertFalse("false",EloLampada.apagarLampada("apagada"));
	}
	
	@Test
	public void estaLigada() {
		Assert.assertTrue("true", EloLampada.estaLigada());
	}
}
