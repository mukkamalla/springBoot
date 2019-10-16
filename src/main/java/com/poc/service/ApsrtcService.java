package com.poc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.model.Ticket;
import com.poc.repository.ApsrtcRepository;
@Service
public class ApsrtcService {
	
	@Autowired
	ApsrtcRepository repo;

	public Ticket createTicket(Ticket ticket) {
		
		return repo.save(ticket);
	}

	public Ticket getTicketByid(Long id) {
		
		return repo.findById(id).orElse(null);
	}

	public void deleteTicketById(Long id) {
		repo.deleteById(id);
		
	}

}
