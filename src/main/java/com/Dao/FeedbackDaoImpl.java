package com.Dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Entity.Feedback;
import com.Utility.HibernateUtility;

public class FeedbackDaoImpl implements FeedbackDao{

	@Override
	public Feedback getFeedback(int id) {
		Session hsesh = HibernateUtility.getSession();
		Feedback f = (Feedback) hsesh.get(Feedback.class, id);
		return f;
	}

	@Override
	public void updateFeedback(Feedback f) {
		Session hsesh = HibernateUtility.getSession();
		Transaction tx = hsesh.beginTransaction();
		hsesh.update(f);
		tx.commit();
	}

	@Override
	public void addFeedback(Feedback f) {
		Session hsesh = HibernateUtility.getSession();
		Transaction tx = hsesh.beginTransaction();
		hsesh.save(f);
		tx.commit();
	}
	
	

}
