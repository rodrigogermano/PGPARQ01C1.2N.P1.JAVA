package br.edu.infnet.manutencao.AppManutencao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AppManutencaoWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppManutencaoWebApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder)  {
		return builder.build();
	}

}
