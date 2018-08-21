package edu.asu.diging.tutorial.spring.domain;

public class Explanation {
	
private String reason;

public Explanation (String explanation)
{
	reason = explanation;
}

public String getReason() {
	return reason;
}

public void setReason(String reason) {
	this.reason = reason;
}
}
