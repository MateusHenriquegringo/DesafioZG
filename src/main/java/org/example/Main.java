package org.example;

import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Printer EscreverLetra = new Printer(System.out);

		EstruturaPrimeiraParte primeiraParte = new EstruturaPrimeiraParte();

		EstruturaSegundaParte segundaParte = new EstruturaSegundaParte();

		EscreverLetra.println(primeiraParte.getPrimeiraParte(), 10);
	}


}