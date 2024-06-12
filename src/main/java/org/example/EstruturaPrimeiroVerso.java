package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class EstruturaPrimeiroVerso {

	private HashMap<Integer, String> frasesVerso = new HashMap<>();

	public String build(List<String> animais){

		frasesVerso.put(1, "Os animaizinhos subiram de dois em dois\n");
		frasesVerso.put(2, animais.get(0)+"\n");
		frasesVerso.put(3, "E "+animais.get(1)+", como os filhos do senhor\n");

		return frasesVerso.get(1).repeat(2) + frasesVerso.get(2) + frasesVerso.get(3);
	}

}
