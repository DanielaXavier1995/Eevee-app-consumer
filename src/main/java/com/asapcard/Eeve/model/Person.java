package com.asapcard.Eeve.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_person")
public class Person {

	@Id
	private String id;

	private String nome;

	private Integer idade;

	@OneToMany
	@JsonIgnoreProperties("person")
	private List<Transaction> transactionList;

}
