/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.sics.kola.examples.errorsandwarnings;

import se.sics.kompics.ComponentDefinition;
import se.sics.kompics.Handler;
import se.sics.kompics.Positive;

/**
 *
 * @author lkroll
 */
public class ComponentC extends ComponentDefinition {
    Positive<PortP> pp = requires(PortP.class);
    
    Handler bHandler = new Handler<EventB>(){

        @Override
        public void handle(EventB event) {
            trigger(new EventA(), pp);
        }
    };
    {
        subscribe(bHandler, pp);
    }
}
