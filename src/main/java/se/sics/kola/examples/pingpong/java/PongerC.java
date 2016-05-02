package se.sics.kola.examples.pingpong.java;

import se.sics.kompics.ComponentDefinition;
import se.sics.kompics.Handler;
import se.sics.kompics.Negative;

public class PongerC extends ComponentDefinition {

    protected final Negative<PingPongPort> ppp = provides(PingPongPort.class);

    public PongerC() {
        subscribe(pingHandler, ppp);
    }

    protected final Handler<Ping> pingHandler = new Handler<Ping>() {
        @Override
        public void handle(Ping ping) {
            trigger(ping, ppp);
        }
    };
}
