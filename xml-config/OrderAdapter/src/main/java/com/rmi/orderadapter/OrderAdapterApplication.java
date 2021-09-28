package com.rmi.orderadapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:beans/main.xml")
public class OrderAdapterApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderAdapterApplication.class, args);
    }

}
