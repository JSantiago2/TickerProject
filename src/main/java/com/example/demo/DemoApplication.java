package com.example.demo;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;

@SpringBootApplication
@EnableScheduling
public class DemoApplication {

    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String args[]) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception{
        return args -> {
            Container container = restTemplate.getForObject(
                    "https://api.cryptonator.com/api/full/btc-usd", Container.class);
            log.info(container.toString());
        };
    }
}
