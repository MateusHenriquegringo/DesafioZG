package org.example;

import java.util.Stack;

public class EstruturaSegundaParte {

	String segundoVerso = EstruturaSegundoVerso.Verso;

	Stack<String> pilhaDeFrases = new Stack<String>() {
		{
			add(" e abraça o irmão\n");
			add("Dá um pulinho");
			add(", dá uma voltinha\n");
			add("Balança a cabeça");
			add(", perna esquerda\n");
			add("Perna direita");
			add(", braço esquerdo\n");
			add("\nBraço direito");
		}
	};

	public String getSegundaParte(){
		 StringBuilder segundaParte = new StringBuilder();
		 StringBuilder fraseDaPilha = new StringBuilder();

		 while (!pilhaDeFrases.empty()){
			 fraseDaPilha.append(pilhaDeFrases.pop());

			 segundaParte.append(segundoVerso).append(fraseDaPilha);
		 }

		 return segundaParte.toString();
	};

}
