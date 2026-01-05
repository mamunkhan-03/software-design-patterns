package com.mamun.designpatterns.runner;

import com.mamun.designpatterns.behavioral.chainOfResponsibility.ChainOfResponsibilityRun;
import com.mamun.designpatterns.behavioral.command.CommandRun;
import com.mamun.designpatterns.behavioral.iterator.IteratorRun;
import com.mamun.designpatterns.behavioral.mediator.MediatorRun;
import com.mamun.designpatterns.behavioral.momento.MementoRun;
import com.mamun.designpatterns.behavioral.observer.ObserverRun;
import com.mamun.designpatterns.behavioral.observer2.Observer2Run;
import com.mamun.designpatterns.behavioral.strategy.StrategyRun;
import com.mamun.designpatterns.behavioral.template.TemplateRun;
import com.mamun.designpatterns.creational.abstractFactory.AbstractFactoryRun;
import com.mamun.designpatterns.creational.builder.BuilderRun;
import com.mamun.designpatterns.creational.factory.FactoryRun;
import com.mamun.designpatterns.creational.prototype.PrototypeRun;
import com.mamun.designpatterns.creational.singleton.SingletonRun;
import com.mamun.designpatterns.solid.dip.DependencyInversionRun;
import com.mamun.designpatterns.solid.isp.InterfaceSegregationRun;
import com.mamun.designpatterns.solid.lsp.LiskovSubstituitionRun;
import com.mamun.designpatterns.solid.ocp.OpenClosedRun;
import com.mamun.designpatterns.solid.srp.SingleResponsibilityRun;
import com.mamun.designpatterns.structural.adapter.AdapterRun;
import com.mamun.designpatterns.structural.bridge.BridgeRun;
import com.mamun.designpatterns.structural.composite.CompositeRun;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.util.concurrent.Executors;

@Component
public class PatternRunner implements CommandLineRunner {

    @Override
    public void run(String... args) {


        //SingleResponsibilityRun.run();
        //OpenClosedRun.run();
        //LiskovSubstituitionRun.run();
        //InterfaceSegregationRun.run();
        //DependencyInversionRun.run();
       // FactoryRun.run();
        //AbstractFactoryRun.run();
        //SingletonRun.run();
        //PrototypeRun.run();
        //BuilderRun.run();
       // ChainOfResponsibilityRun.run();
        //CommandRun.run();
        //StrategyRun.run();
        //ObserverRun.run();
        //Observer2Run.run();
        //IteratorRun.run();
        //TemplateRun.run();
        //MementoRun.run();
        //MediatorRun.run();
        //AdapterRun.run();
        //BridgeRun.run();
        //CompositeRun.run();


    }
}
