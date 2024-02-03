package com.asapcard.Eeve.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_transaction")
public class Transaction implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;

	@ManyToOne
	@JsonIgnoreProperties("transaction")
	private Person person_id;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "transaction_id", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("transaction")
	private List<Installment> installmentList;

	private Double amount;

	private Date transaction_date;

}
