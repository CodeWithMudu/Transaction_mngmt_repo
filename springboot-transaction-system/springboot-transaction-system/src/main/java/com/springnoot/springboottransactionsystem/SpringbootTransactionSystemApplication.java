package com.springnoot.springboottransactionsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringbootTransactionDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTransactionDemoApplication.class, args);
    }

}

// this is a springboot applicationn that is being downloaded from "start.spring.io" website
