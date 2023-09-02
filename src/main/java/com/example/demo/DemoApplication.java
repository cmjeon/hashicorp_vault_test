package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@Slf4j
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
//        SpringApplication.run(DemoApplication.class, args);
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        // vault 테스트 --
        VaultData vaultData = context.getBean(VaultData.class);
        log.info("username:{}", vaultData.getUsername());
        log.info("password:{}", vaultData.getPassword());
        log.info("host:{}", vaultData.getHost());
    }

}
