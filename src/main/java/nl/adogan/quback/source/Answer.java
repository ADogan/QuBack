package nl.adogan.quback.source;

public class Answer {
	
	private String answerText;
	private boolean correct;

	public Answer(String answerText, boolean correct) {
		this.setAnswerText(answerText);
		this.correct = correct;
	}
	
	public String getAnswerText() {
		return answerText;
	}

	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}

	public boolean isCorrect() {
		return correct;
	}
	public String toString() {
		return answerText;
	}
}
