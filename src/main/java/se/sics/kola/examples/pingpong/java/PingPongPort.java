package se.sics.kola.examples.pingpong.java;

import se.sics.kompics.PortType;

public class PingPongPort extends PortType {
    {
        indication(Ping.class);
        request(Ping.class);
    }
}
