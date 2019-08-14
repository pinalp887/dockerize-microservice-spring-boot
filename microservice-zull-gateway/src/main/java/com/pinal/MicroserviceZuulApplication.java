package com.pinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import brave.sampler.Sampler;

@SpringBootApplication
public class MicroserviceZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceZuulApplication.class, args);
	}

	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
}
