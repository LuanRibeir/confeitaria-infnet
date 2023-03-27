package br.edu.infnet.appconfeitaria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppconfeitariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppconfeitariaApplication.class, args);
	}

}
