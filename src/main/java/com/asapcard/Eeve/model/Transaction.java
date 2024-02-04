package com.asapcard.Eeve.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_transaction")
@Setter
@Getter
public class Transaction implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private UUID id;

	@ManyToOne
	@JsonIgnoreProperties("transaction")
	private Person personId;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "transactionId", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("transaction")
	private List<Installment> installmentList;

	private Double amount;

	private LocalDate transactionDate;

}
