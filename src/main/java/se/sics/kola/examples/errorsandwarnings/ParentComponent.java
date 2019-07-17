/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.sics.kola.examples.errorsandwarnings;

import se.sics.kompics.Component;
import se.sics.kompics.ComponentDefinition;
import se.sics.kompics.Init;

/**
 *
 * @author lkroll
 */
public class ParentComponent extends ComponentDefinition {{
	Component cc = create(ComponentC.class, Init.NONE);
        Component cd = create(ComponentD.class, Init.NONE);
	connect(cc.getPositive(PortP.class), cd.getNegative(PortP.class));
}}
