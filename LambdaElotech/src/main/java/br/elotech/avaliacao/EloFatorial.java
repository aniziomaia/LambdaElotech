package br.elotech.avaliacao;

import java.util.function.Function;

public class EloFatorial {
	
	static class Aux {
        Function<Integer, Integer> f;
    }

	public int getFatorial(int numero) {
		return fatorial(numero);
	}
	
	private int fatorial(int numero) {
		
		final Aux aux = new Aux();
		
		aux.f = x -> x == 0 ? 1 : x * aux.f.apply(x - 1);
        return aux.f.apply(numero);
	}
}