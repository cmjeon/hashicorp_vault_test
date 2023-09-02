package com.example.demo;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class VaultData {

    @Value("${username}")
    private String username;

    @Value("${password}")
    private String password;

    @Value("${host}")
    private String host;

}
