package se.sics.kola.examples.helloworld.java;

import se.sics.kompics.ComponentDefinition;
import se.sics.kompics.Handler;
import se.sics.kompics.Kompics;
import se.sics.kompics.Start;

public class HelloC extends ComponentDefinition {

    {
        Handler startHandler = new Handler<Start>() {

            @Override
            public void handle(Start event) {
                System.out.println("Hello World from Kola!");
                Kompics.asyncShutdown();
            }
        };
        subscribe(startHandler, control);
    }
}
