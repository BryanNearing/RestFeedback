package com.Dao;

import com.Entity.Feedback;

public interface FeedbackDao {

	public Feedback getFeedback(int id) ;
	 
	public void updateFeedback(Feedback f) ;
	
	public void addFeedback(Feedback f);
	
}