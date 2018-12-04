package nl.adogan.quback.activity;

import nl.adogan.quback.source.Quiz;
import nl.adogan.quback.users.User;

public class Taken{
	
	private User user;
	private boolean finished;
	private Quiz quiz;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public boolean isFinished() {
		return finished;
	}
	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	
	public Quiz getQuiz() {
		return quiz;
	}
	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

}
