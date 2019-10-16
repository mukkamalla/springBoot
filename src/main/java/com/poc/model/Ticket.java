package com.poc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Ticket {
    @Id
    private int id;
    private String name;
    private String frmAddrs;
    private String toAddrs;
    private int cost;
	public Ticket() {
		super();
	}
	public Ticket(int id, String name, String frmAddrs, String toAddrs, int cost) {
		super();
		this.id = id;
		this.name = name;
		this.frmAddrs = frmAddrs;
		this.toAddrs = toAddrs;
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFrmAddrs() {
		return frmAddrs;
	}
	public void setFrmAddrs(String frmAddrs) {
		this.frmAddrs = frmAddrs;
	}
	public String getToAddrs() {
		return toAddrs;
	}
	public void setToAddrs(String toAddrs) {
		this.toAddrs = toAddrs;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", name=" + name + ", frmAddrs=" + frmAddrs + ", toAddrs=" + toAddrs + ", cost="
				+ cost + "]";
	}
    
    
}
