package se.sics.kola.examples.pingpong.java;

import se.sics.kompics.Init;
import se.sics.kompics.Kompics;

public class Main {
    public final static int BATCH_SIZE = 50;
    public final static long REPEAT = 50000000;

    public static void main(String[] args) {
        Kompics.createAndStart(ParentC.class, Init.NONE, 4, BATCH_SIZE);
    }
}
