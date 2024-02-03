package com.asapcard.Eeve.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Transaction extends JpaRepository<Transaction, UUID> {
		
}
