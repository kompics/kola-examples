package se.sics.kola.examples.pingpong.java;

import se.sics.kompics.Init;
import se.sics.kompics.Kompics;

public class Main {
    public final static int BATCH_SIZE = 50;
    public final static long REPEAT = 50000000;

    public static void main(String[] args) {
        try {
			Kompics.createAndStart(ParentC.class, 2, BATCH_SIZE);
			Kompics.waitForTermination();
		} catch(InterruptedException ex) {
			System.err.println("Got rudely interruped!");
			System.exit(1);
		}
    }
}
