package br.elotech.avaliacao;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
/**
 * executa todos os teste do sistema
 * @author aniziomaia
 *
 */
@RunWith(Suite.class)
@SuiteClasses({TesteFatorial.class, TesteLampada.class, TesteOcorrenciaPalavra.class, 
	           TestePrimos.class, TestePalavraInvertida.class, TesteTroco.class })
public class TesteSwitch {

}
