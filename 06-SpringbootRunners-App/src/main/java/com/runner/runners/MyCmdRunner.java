package com.runner.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCmdRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("+++CommandLine Runner :: run method+++");

    }
}