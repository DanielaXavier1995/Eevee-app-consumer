package com.asapcard.Eeve.model;

import org.springframework.amqp.core.Message;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JsonTransaction {
	
	private Integer age;
    //private Integer installmentNumber;
   //private Double amount;
    private Long personId;
    private String name;
   // private UUID transactionId;
   // private LocalDate transactionDate;
    
    public String toJson(Message message) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(message);
    }
    
    
}
