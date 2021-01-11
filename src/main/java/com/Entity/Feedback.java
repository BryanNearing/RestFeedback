package com.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Feedback {
	
	@Id
	@GeneratedValue
	private int id;
	private String feedback;
	
	public Feedback(String feedback) {
		super();
		this.feedback = feedback;
	}
	
	public Feedback(int id, String feedback) {
		super();
		this.id = id;
		this.feedback = feedback;
	}

	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	

}
