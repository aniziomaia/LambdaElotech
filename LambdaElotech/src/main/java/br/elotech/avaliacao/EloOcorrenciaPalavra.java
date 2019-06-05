package br.elotech.avaliacao;

public class EloOcorrenciaPalavra {

    public int contaOcorrencia(String palavra, String frase) {
    	
		int posicao = -1;
		int quantidade = 0;
		while (true) {
			posicao = frase.indexOf (palavra, posicao + 1); 
		    if (posicao < 0) 
		    	break;
		    quantidade++;
		}
        return quantidade;
    }
}