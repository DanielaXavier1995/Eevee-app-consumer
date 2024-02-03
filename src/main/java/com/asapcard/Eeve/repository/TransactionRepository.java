package com.asapcard.Eeve.repository;

import java.util.UUID;
import com.asapcard.Eeve.model.Transaction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, UUID> {
		
}
