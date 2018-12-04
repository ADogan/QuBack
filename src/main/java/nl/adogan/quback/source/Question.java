package nl.adogan.quback.source;

import java.util.List;
import java.util.ArrayList;

public class Question {

	private Image image;
	private Category category;
	private List<Tag> tags;
	private String questionText;
	private List<Answer> possibleAnswers;
	private Answer correctAnswer;
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public List<Tag> getTags() {
		return tags;
	}
	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	
	public String getQuestionText() {
		return questionText;
	}
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	
	public Answer getCorrectAnswer() {
		return correctAnswer;
	}
	public void setCorrectAnswer(Answer correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	
	public List<Answer> getPossibleAnswers() {
		return possibleAnswers;
	}
	public void setPossibleAnswers(List<Answer> possibleAnswers) {
		this.possibleAnswers = possibleAnswers;
	}
	
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}

}
