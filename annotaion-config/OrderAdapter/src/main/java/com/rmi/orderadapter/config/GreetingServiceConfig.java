package com.rmi.orderadapter.config;

import com.rmi.contract.greetingservice.service.GreetingService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

@Configuration
public class GreetingServiceConfig {

    @Value("${service.greeting.url}")
    private String url;

    @Bean
    public HttpInvokerProxyFactoryBean greetingServiceInvoker() {
        HttpInvokerProxyFactoryBean invoker = new HttpInvokerProxyFactoryBean();
        invoker.setServiceUrl(url);
        invoker.setServiceInterface(GreetingService.class);
        return invoker;
    }

}
