package com.lovestoblog.vitornatal.domainshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DomainShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(DomainShopApplication.class, args);
    }

}
