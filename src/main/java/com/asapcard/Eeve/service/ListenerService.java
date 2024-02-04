package com.asapcard.Eeve.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asapcard.Eeve.model.Person;
import com.asapcard.Eeve.repository.InstallmentRepository;
import com.asapcard.Eeve.repository.PersonRepository;
import com.asapcard.Eeve.repository.TransactionRepository;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ListenerService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private InstallmentRepository installmentRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    private final ObjectMapper objectMapper = new ObjectMapper();

    @RabbitListener(queues = "queue-a")
    public void listen(String message) {
        try {
            JsonNode jsonNode = objectMapper.readTree(message);

            Person person = new Person();
            person.setId(jsonNode.get("id").asLong());
            person.setName(jsonNode.get("nome").asText());
            person.setAge(jsonNode.get("idade").asInt());

            java.util.Optional<Person> personFound = personRepository.findById(person.getId());
            UUID uuid = UUID.randomUUID();

            if (!personFound.isPresent()) {
                personRepository.save(person);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
