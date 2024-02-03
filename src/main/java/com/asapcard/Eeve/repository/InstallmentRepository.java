package com.asapcard.Eeve.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asapcard.Eeve.model.Installment;

@Repository
public interface InstallmentRepository extends JpaRepository<Installment, UUID>{

}
