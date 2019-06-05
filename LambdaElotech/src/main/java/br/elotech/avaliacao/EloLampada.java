package br.elotech.avaliacao;

import java.util.Comparator;

public class EloLampada {

	public static boolean acenderLampada(String acessa) {
		Comparator<String> c = (String l, String d) -> l.compareTo(d);
	    int result = c.compare("acessa", acessa);

		return result == 0 ? true :false;
	}
	
	public static boolean apagarLampada(String apagada) {
		Comparator<String> c = (String l, String d) -> l.compareTo(d);
	    int result = c.compare("apagada", apagada);

		return result == 0 ? false :true;
	}
	
	public static boolean estaLigada() {
		
		return acenderLampada("acessa");
	}
}
