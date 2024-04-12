package com.block.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

@Configuration
public class Web3jConfig {

    private final String web3Url = "http://localhost:8545";

    @Bean
    public Web3j web3j() {
        return Web3j.build(new HttpService(web3Url));
    }
}