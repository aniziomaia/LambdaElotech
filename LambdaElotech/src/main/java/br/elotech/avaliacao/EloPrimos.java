package br.elotech.avaliacao;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EloPrimos {
	
	public static String getPrimos(int numero) {
		String resultado = "";
		for(int i = 1; i < numero; i++) {
			if(isPrimo(i))
				resultado = resultado + i + ",";
		}
		return (String) resultado.subSequence(0, resultado.length()-1);
	}
	
	private static boolean isPrimo(int n) {
	    IntPredicate isDivisivel = index -> n % index == 0;
	    return n > 1 && IntStream.range(2, n - 1).noneMatch(isDivisivel);
	}
}
