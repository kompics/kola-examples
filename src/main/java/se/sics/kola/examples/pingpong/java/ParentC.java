package se.sics.kola.examples.pingpong.java;

import se.sics.kompics.Component;
import se.sics.kompics.ComponentDefinition;
import se.sics.kompics.Init;

public class ParentC extends ComponentDefinition {

    protected final Component pinger = create(PingerC.class, Init.NONE);
    protected final Component ponger = create(PongerC.class, Init.NONE);

    public ParentC() {
        connect(ponger.getPositive(PingPongPort.class), pinger.getNegative(PingPongPort.class));
    }
}
