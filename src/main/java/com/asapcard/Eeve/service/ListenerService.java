package com.asapcard.Eeve.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.apache.el.stream.Optional;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asapcard.Eeve.model.JsonTransaction;
import com.asapcard.Eeve.model.Person;
import com.asapcard.Eeve.model.Transaction;
import com.asapcard.Eeve.repository.InstallmentRepository;
import com.asapcard.Eeve.repository.PersonRepository;
import com.asapcard.Eeve.repository.TransactionRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
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
            
            personRepository.save(person);
            
            java.util.Optional<Person> personFinded = personRepository.findById(person.getId());
            UUID uuid = UUID.randomUUID();

            if (!personFinded.isPresent()) { 
                personRepository.save(person);
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
 }}

