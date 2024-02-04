package com.asapcard.Eeve.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_person")
@Getter
@Setter
public class Person {

	@Id
	private Long id;

	private String name;

	private Integer age;

}
