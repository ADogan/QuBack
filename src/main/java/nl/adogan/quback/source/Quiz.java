package nl.adogan.quback.source;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
	private String quizName;
	private List<Question> questions = new ArrayList<Question>();
	
	public Quiz() {
		this.setQuizName("empty quizname");
		questions = new ArrayList<Question>();
	}
	
	public String getQuizName() {
		return quizName;
	}
	public void setQuizName(String quizName) {
		this.quizName = quizName;
	}
	
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public String toString() {
		return this.getQuizName() + " with " + questions.size() + " questions";
	}
}
