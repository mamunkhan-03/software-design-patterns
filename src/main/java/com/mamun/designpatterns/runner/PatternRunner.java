package com.mamun.designpatterns.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.mamun.designpatterns.creational.singleton.SingletonDemo;
@Component
public class PatternRunner implements CommandLineRunner {

    @Override
    public void run(String... args) {

        System.out.println("welcome");
        System.out.println("===== DESIGN PATTERN DEMO =====");

        SingletonDemo.run();

    }
}
