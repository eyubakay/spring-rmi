
package com.rmi.greetingservice.config;

import com.rmi.contract.greetingservice.service.GreetingService;
import com.rmi.greetingservice.service.impl.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

@Configuration
public class CalculatorServiceExportingConfig {

	@Bean(name = "greetingService")
	GreetingService instantiate() {
		return new GreetingServiceImpl();
	}

	@Bean(name = "/greeting")
	HttpInvokerServiceExporter serviceExporter(@Qualifier("greetingService") GreetingService service) {
		return getExporter(service, GreetingService.class);
	}

	public static HttpInvokerServiceExporter getExporter(Object service, Class<?> serviceInterface) {
		HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
		exporter.setService(service);
		exporter.setServiceInterface(serviceInterface);
		return exporter;
	}
}
