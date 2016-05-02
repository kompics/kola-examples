package se.sics.kola.examples.pingpong.java;

import se.sics.kompics.KompicsEvent;

public class Ping implements KompicsEvent {
    public final static Ping event = new Ping();

    private Ping() {
    }
}
