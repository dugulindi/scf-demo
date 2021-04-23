package com.ztjy.scf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

@SpringBootApplication
public class ScfDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScfDemoApplication.class, args);
    }

    @Bean
    public Function<String, String> uppercase() {
        return value -> value.toUpperCase();
    }

}
