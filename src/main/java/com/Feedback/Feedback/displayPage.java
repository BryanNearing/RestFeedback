package com.Feedback.Feedback;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class displayPage {
	
	@GetMapping("/inputForm")
	public static String getForm() {
		return "testForm";
	}
}
