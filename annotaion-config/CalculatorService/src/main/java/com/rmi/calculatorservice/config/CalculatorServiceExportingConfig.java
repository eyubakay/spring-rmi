
package com.rmi.calculatorservice.config;

import com.rmi.calculatorservice.service.impl.CalculatorServiceImpl;
import com.rmi.contract.calculatorservice.service.CalculatorService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

@Configuration
public class CalculatorServiceExportingConfig {

	@Bean(name = "calculatorService")
	CalculatorService instantiate() {
		return new CalculatorServiceImpl();
	}

	@Bean(name = "/calculator")
	HttpInvokerServiceExporter serviceExporter(@Qualifier("calculatorService") CalculatorService service) {
		return getExporter(service, CalculatorService.class);
	}

	public static HttpInvokerServiceExporter getExporter(Object service, Class<?> serviceInterface) {
		HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
		exporter.setService(service);
		exporter.setServiceInterface(serviceInterface);
		return exporter;
	}
}
