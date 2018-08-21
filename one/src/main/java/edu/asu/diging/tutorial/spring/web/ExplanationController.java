package edu.asu.diging.tutorial.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.asu.diging.tutorial.spring.service.ExplanationService;

@Controller
public class ExplanationController {
	
	@Autowired
	private ExplanationService service;
	
	@RequestMapping(value="/explanation/{mood}")
	public String showExplanation(@PathVariable("mood") String mood, Model model, ModelMap map) {
	    model.addAttribute("mood", mood);
	    map.addAttribute("explanation", service.getExplanation());
	    
	    return "explanation";
	}
	
}
