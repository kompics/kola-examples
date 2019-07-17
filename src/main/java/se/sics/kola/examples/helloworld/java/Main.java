package se.sics.kola.examples.helloworld.java;

import se.sics.kompics.Init;
import se.sics.kompics.Kompics;

public class Main {
	public static void main(String[] args) {
		try {
			Kompics.createAndStart(HelloC.class);
			Kompics.waitForTermination();
		} catch(InterruptedException ex) {
			System.err.println("Got rudely interruped!");
			System.exit(1);
		}
	}	
}
