package br.com.pradella;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class CircuitBreakerExempleApplication {
	public static void main(String[] args) {
		SpringApplication.run(CircuitBreakerExempleApplication.class, args);
	}
}
