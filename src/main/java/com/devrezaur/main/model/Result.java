package com.devrezaur.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "results")
public class Result {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String username;

	private String sap;
	private int totalCorrect = 0;

	public Result() {
		super();
	}

	public Result(int id, String username, int totalCorrect, String sap) {
		super();
		this.id = id;
		this.username = username;
		this.sap=sap;
		this.totalCorrect = totalCorrect;
	}

	public String getSap() {
		return sap;
	}

	public void setSap(String sap) {
		this.sap = sap;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getTotalCorrect() {
		return totalCorrect;
	}

	public void setTotalCorrect(int totalCorrect) {
		this.totalCorrect = totalCorrect;
	}

}
