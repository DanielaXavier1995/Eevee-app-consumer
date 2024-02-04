package com.asapcard.Eeve.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asapcard.Eeve.model.Person;
import com.asapcard.Eeve.repository.PersonRepository;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ListenerService {

	@Autowired
	private PersonRepository personRepository;

	private final ObjectMapper objectMapper = new ObjectMapper();

	@RabbitListener(queues = "queue-a")
	public void listen(String message) {
		try {
			if (!(message != null && message.isEmpty())) {

				JsonNode jsonNode = objectMapper.readTree(message);

				Person person = new Person();
				person.setId(jsonNode.get("id").asLong());
				person.setName(jsonNode.get("nome").asText());
				person.setAge(jsonNode.get("idade").asInt());

				List<Person> personList = new ArrayList<>();
				personList.add(person);

				personRepository.saveAll(personList);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

