package com.mamun.designpatterns.runner;

import com.mamun.designpatterns.solid.dip.DependencyInversionRun;
import com.mamun.designpatterns.solid.isp.InterfaceSegregationRun;
import com.mamun.designpatterns.solid.lsp.LiskovSubstituitionRun;
import com.mamun.designpatterns.solid.ocp.OpenClosedRun;
import com.mamun.designpatterns.solid.srp.SingleResponsibilityRun;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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

    }
}
