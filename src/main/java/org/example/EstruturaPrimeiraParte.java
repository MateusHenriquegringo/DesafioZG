package org.example;

import java.util.*;

public class EstruturaPrimeiraParte {


	String refrao = Refrao.build();

	EstruturaPrimeiroVerso primeiroVerso = new EstruturaPrimeiroVerso();

	String ponte = "Deus disse a Noé: Constrói uma arca\n".repeat(
			2) + "Que seja feita\n" + "De madeira para os filhos do Senhor\n";

	String fimPrimeiraParte = "E atenção agora, porque\n";

	List<List<String>> listaAnimais = new ArrayList<>(
			Arrays.asList(
					Arrays.asList("O elefante", "os passarinhos"),
					Arrays.asList("A minhoquinha", "os pinguins"),
					Arrays.asList("O canguru", "o sapinho")
			)
	);


	public Queue<String> buildPrimeiraParte() {

		Queue<String> primeiraParte = new ArrayDeque<>();
		primeiraParte.add(refrao);

		for (List<String> animais : listaAnimais) {
			primeiraParte.add(
					primeiroVerso.build(animais)
			);
		}

		primeiraParte.add(ponte);
		primeiraParte.add("Por isso...!\n");

		for (int i = 0; i < 3; i++) {
			primeiraParte.add(refrao);
		}

		primeiraParte.add(fimPrimeiraParte);

		return primeiraParte;
	}


	public String getPrimeiraParte() {

		StringBuilder primeiraParte = new StringBuilder();

		Queue<String> parteUm = buildPrimeiraParte();

		while (!parteUm.isEmpty()) {
			primeiraParte.append(parteUm.peek());
			parteUm.remove();
		}
		return primeiraParte.toString();
	}


	;
}
