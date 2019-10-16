package com.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poc.model.Ticket;

public interface ApsrtcRepository extends JpaRepository<Ticket, Integer>{

}
