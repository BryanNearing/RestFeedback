package com.Feedback.Feedback;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.Dao.FeedbackDaoImpl;
import com.Entity.Feedback;

@RestController
@RequestMapping("/rest")
public class RestFeedback {

	@GetMapping("/feedback/{id}")
	public static Feedback getFeedback(@PathVariable("id") int id){
		FeedbackDaoImpl dao = new FeedbackDaoImpl();
		
		Feedback f = dao.getFeedback(id);
		
		if(f != null)
			return f;
		else
			return new Feedback(-1, "There was not a feedback with the id requested");
	}
	
	@PostMapping("/updateFeedback/{id}") 
	public static void updateFeedback(@PathVariable("id") int id, @RequestBody String feedback) {
		FeedbackDaoImpl dao = new FeedbackDaoImpl(); 
		dao.updateFeedback(new Feedback(id, feedback));
	}
	
	@GetMapping("/submitFeedback")
	public ModelAndView addFeedbackWithForm() {
		Feedback f = new Feedback();
		return new ModelAndView("testForm", "feed", f);
	}
	
	@PostMapping("/submitFeedback/submit")
	public ModelAndView submit(@ModelAttribute Feedback f) {
		FeedbackDaoImpl dao = new FeedbackDaoImpl(); 
		dao.addFeedback(f);
		return new ModelAndView("redirect:/rest/submitFeedback");
	}

}
