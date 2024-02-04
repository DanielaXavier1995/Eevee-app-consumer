package com.asapcard.Eeve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.asapcard.Eeve.service.ListenerService;

@SpringBootApplication
public class EeveApplication {

	public static void main(String[] args) {
		SpringApplication.run(EeveApplication.class, args);

		ListenerService listenerService = new ListenerService();
		String message = "";
		listenerService.listen(message);
	}

}
