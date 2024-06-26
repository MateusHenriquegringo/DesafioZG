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


	public Stack<String> buildPrimeiraParte() {

		Stack<String> primeiraParte = new Stack<>();

		primeiraParte.push(fimPrimeiraParte);

		for (int i = 0; i < 3; i++) {
			primeiraParte.push(refrao);
		}

		primeiraParte.push("Por isso...!\n");
		primeiraParte.push(ponte);

		for (int i = listaAnimais.size() - 1; i >= 0; i--) {
			primeiraParte.push(
					primeiroVerso.build(listaAnimais.get(i))
			);
		}

		primeiraParte.push(refrao);

		return primeiraParte;
	}


	public String getPrimeiraParte() {

		StringBuilder primeiraParte = new StringBuilder();

		Stack<String> parteUm = buildPrimeiraParte();

		while (!parteUm.isEmpty()) {
			primeiraParte.append(parteUm.pop()+"\n");
		}
		return primeiraParte.toString();
	}


	;
}
