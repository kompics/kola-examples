package se.sics.kola.examples.helloworld.java;

import se.sics.kompics.Init;
import se.sics.kompics.Kompics;

public class Main {
	public static void main(String[] args) {
		Kompics.createAndStart(HelloC.class, Init.NONE);
	}	
}
