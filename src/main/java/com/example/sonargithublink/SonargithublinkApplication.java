package com.example.sonargithublink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SonargithublinkApplication {

    public static void main(String[] args) {
        SpringApplication.run(SonargithublinkApplication.class, args);
        doARandomLongMathOperation();
    }

    private static void doARandomLongMathOperation() {
        long a = 1;
        long b = 2;
        long c = a + b;
        System.out.println("Result of a + b = " + c);
    }
}
