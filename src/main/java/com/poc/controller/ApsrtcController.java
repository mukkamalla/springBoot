package com.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.poc.model.Ticket;
import com.poc.service.ApsrtcService;

@RestController
public class ApsrtcController {
	
	@Autowired
	ApsrtcService apsrtcService;
	
	@PostMapping("/create-ticket")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		return apsrtcService.createTicket(ticket);
		
	}
	@GetMapping("/get-ticket/{id}")
	public Ticket getTicketByid(@PathVariable Integer id) {
		return apsrtcService.getTicketByid(id);
		
	}
	@DeleteMapping("/delete-ticket/{id}")
	public void deleteTicketById(@PathVariable Integer id) {
		apsrtcService.deleteTicketById(id);
	}

}
