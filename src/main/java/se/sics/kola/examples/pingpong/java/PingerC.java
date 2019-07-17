package se.sics.kola.examples.pingpong.java;

import se.sics.kompics.ComponentDefinition;
import se.sics.kompics.Handler;
import se.sics.kompics.Kompics;
import se.sics.kompics.Positive;
import se.sics.kompics.Start;

public class PingerC extends ComponentDefinition {

    protected final Positive<PingPongPort> ppp = requires(PingPongPort.class);

    private long sent = 0;
    private long received = 0;
    private long startTs;

    public PingerC() {
        subscribe(startHandler, control);
        subscribe(pongHandler, ppp);
    }

    protected final Handler<Start> startHandler = new Handler<Start>() {
        @Override
        public void handle(Start e) {
            startTs = System.currentTimeMillis();
            for (int i = 0; (i < Main.BATCH_SIZE); i++) {
                trigger(Ping.event, ppp);
            }
            sent = Main.BATCH_SIZE;
        }
    };
    
    protected final Handler<Ping> pongHandler = new Handler<Ping>() {
        @Override
        public void handle(Ping pong) {
            received += 1;
            if (sent < Main.REPEAT) {
                trigger(Ping.event, ppp);
                sent += 1;
            } else if (received >= Main.REPEAT) {
                long endTs = System.currentTimeMillis();
                long diff = (endTs - startTs);
                long tp = ((sent+received) / (diff / 1000l));
                System.out.println(String.format("Final Throughput: %,d msgs/s", tp));
                Kompics.asyncShutdown();
            }
        }
    };
}
