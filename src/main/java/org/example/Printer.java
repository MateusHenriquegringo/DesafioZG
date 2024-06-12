package org.example;

import java.io.OutputStream;
import java.io.PrintStream;


public class Printer extends PrintStream {

	public Printer(OutputStream out) {

		super(out);
	}


	public void println(String x, int delay) {

		synchronized (this) {
			printSlowly(x,
			            delay);
			print("\n");
		}
	}


	private void printSlowly(String text, int delay) {

		for (char c : text.toCharArray()) {
			print(String.valueOf(c));
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
	}

}
