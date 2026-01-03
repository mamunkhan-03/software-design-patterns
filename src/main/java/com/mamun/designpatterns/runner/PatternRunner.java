package com.mamun.designpatterns.runner;

import com.mamun.designpatterns.behavioral.chainOfResponsibility.ChainOfResponsibilityRun;
import com.mamun.designpatterns.behavioral.command.CommandRun;
import com.mamun.designpatterns.behavioral.strategy.StrategyRun;
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
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executors;

@Component
public class PatternRunner implements CommandLineRunner {

    @Override
    public void run(String... args) {

        System.out.println("welcome");
        System.out.println("===== DESIGN PATTERN DEMO =====");

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
        StrategyRun.run();


//        Thread.startVirtualThread(() -> SingleResponsibilityRun.run());
//
//        Thread.startVirtualThread(() -> OpenClosedRun.run());
//
//        Thread.startVirtualThread(() -> LiskovSubstituitionRun.run());
//
//        Thread.startVirtualThread(() -> InterfaceSegregationRun.run());
//
//        Thread.startVirtualThread(() -> DependencyInversionRun.run());


//        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
//
//            executor.submit(SingleResponsibilityRun::run);
//            executor.submit(OpenClosedRun::run);
//            executor.submit(LiskovSubstituitionRun::run);
//            executor.submit(InterfaceSegregationRun::run);
//            executor.submit(DependencyInversionRun::run);
//        }

    }
}
