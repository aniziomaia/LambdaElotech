package br.elotech.avaliacao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.elotech.avaliacao.EloOcorrenciaPalavra;

//Fazer um algorítimo que conte a quantidade de ocorrências em uma palavra/frase', #13, #13,
//'Ex: Programador Programação', #13, 'Ocorrência: ama', #13, 'Resultado: 2

public class TesteOcorrenciaPalavra {

	private EloOcorrenciaPalavra eloOcorrenciaPalavra;

	@Before
	public void setup() {
		this.eloOcorrenciaPalavra = new EloOcorrenciaPalavra();
	}

	
	public EloOcorrenciaPalavra getEloOcorrenciaPalavra() {
		return new EloOcorrenciaPalavra();
	}

	@Test
	public void testeProgramadorProgramacao() {
		Assert.assertEquals(2, eloOcorrenciaPalavra.contaOcorrencia("ama",
				"Programador Programação"));

	}
	
	@Test
	public void testeBanana() {
		Assert.assertEquals(2, eloOcorrenciaPalavra.contaOcorrencia("na",
				"Banana"));
	}

}
