package com.mamun.designpatterns.runner;

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
        DependencyInversionRun.run();

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
