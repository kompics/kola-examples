/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.sics.kola.examples.errorsandwarnings;

import se.sics.kompics.ComponentDefinition;
import se.sics.kompics.Handler;
import se.sics.kompics.Start;

/**
 *
 * @author lkroll
 */
public class ComponentD extends ComponentDefinition {
    Handler<Start> startHandler = new Handler<Start>(){

        @Override
        public void handle(Start event) {
            // Do something
        }
    };
}
