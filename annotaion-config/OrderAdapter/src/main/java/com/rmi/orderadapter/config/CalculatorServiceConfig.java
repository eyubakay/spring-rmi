package com.rmi.orderadapter.config;

import com.rmi.contract.calculatorservice.service.CalculatorService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

@Configuration
public class CalculatorServiceConfig {

    @Value("${service.calculator.url}")
    private String url;

    @Bean
    public HttpInvokerProxyFactoryBean calculatorServiceInvoker() {
        HttpInvokerProxyFactoryBean invoker = new HttpInvokerProxyFactoryBean();
        invoker.setServiceUrl(url);
        invoker.setServiceInterface(CalculatorService.class);
        return invoker;
    }

}
