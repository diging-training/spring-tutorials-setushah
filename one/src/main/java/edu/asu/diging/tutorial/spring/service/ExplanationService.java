package edu.asu.diging.tutorial.spring.service;

import org.springframework.stereotype.Service;

import edu.asu.diging.tutorial.spring.domain.Explanation;

@Service
public class ExplanationService {
	
	public Explanation getExplanation() {
		return new Explanation("It's just that way! bleh !!");
	}

}
