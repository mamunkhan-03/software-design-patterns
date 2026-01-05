package com.mamun.designpatterns.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ThreadRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {



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
