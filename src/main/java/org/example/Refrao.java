package org.example;
import java.util.HashMap;

public class Refrao {

	private static HashMap<Integer, String> frasesRefrao = new HashMap<>();

	public static String build() {

		frasesRefrao.put(1, "Erguei as maos");
		frasesRefrao.put(2, " e dai gloria a Deus\n");
		frasesRefrao.put(3, "E cantai");
		frasesRefrao.put(4, " como os filhos do Senhor\n");
		frasesRefrao.put(5, frasesRefrao.get(1) + frasesRefrao.get(2));

		return frasesRefrao.get(5).repeat(2) + frasesRefrao.get(1) + "\n" + frasesRefrao.get(3) + frasesRefrao.get(4);
	}

}
