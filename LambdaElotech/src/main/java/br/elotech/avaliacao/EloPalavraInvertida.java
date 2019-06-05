package br.elotech.avaliacao;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class EloPalavraInvertida {

	public String invertePalavra(String palavra){
		 
		 return Pattern.compile(" +").splitAsStream(palavra)
			        .map(letras->new StringBuilder(letras).reverse())
			        .collect(Collectors.joining(" "));
	}
	
}
