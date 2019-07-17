/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.sics.kola.examples.errorsandwarnings;

import se.sics.kompics.PortType;

/**
 *
 * @author lkroll
 */
public class PortP extends PortType {

    {
        indication(EventA.class);
        request(EventB.class);
    }
}
