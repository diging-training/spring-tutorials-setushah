package edu.asu.diging.tutorial.spring.service;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import edu.asu.diging.tutorial.spring.domain.Mood;

@Service
public class MoodService {

	
	public Mood getCurrentMood() {
		int min = 0;
		int max = 6;
		Random rand = new Random();

		int randomNumber = rand.nextInt(max - min + 1) + min;

		switch (randomNumber) {
		case 0:
			return happy();

		case 1:
			return sad();

		case 2:
			return angry();

		case 3:
			return excited();

		case 4:
			return anxious();

		case 5:
			return cool();

		case 6:
			return satisfied();

		default:
			return new Mood("super happy");
		}
	}

	private Mood happy() {
		return new Mood("happy");
	}

	private Mood sad() {
		return new Mood("sad");
	}

	private Mood angry() {
		return new Mood("angry");
	}

	private Mood excited() {
		return new Mood("excited");
	}

	private Mood anxious() {
		return new Mood("anxious");
	}

	private Mood cool() {
		return new Mood("cool");
	}

	private Mood satisfied() {
		return new Mood("satisfied");
	}
	
	@PostConstruct
	public void initIt() throws Exception{
		
		getCurrentMood();
	}
	
	
	
}
