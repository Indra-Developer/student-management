package com.indra.student.enitity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	private String email;
	private String portfoliourl;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPortfoliourl() {
		return portfoliourl;
	}
	public void setPortfoliourl(String portfoliourl) {
		this.portfoliourl = portfoliourl;
	}
	
	

}
