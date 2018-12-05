package nl.adogan.quback.quback_runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import nl.adogan.quback.source.Answer;
import nl.adogan.quback.source.Question;
import nl.adogan.quback.source.Quiz;

@RestController
public class Quizcontroller {

	@RequestMapping(method=RequestMethod.GET, value="/quiz")
	public String getQuiz() {
		return new Quiz().toString();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/quizzes")
	public List<Quiz> getAllQuizzes(){
		// TODO replace by getting the actual quizzes, stored in xml or database
		return stubAllQuizzes();
	}

	private List<Quiz> stubAllQuizzes() {
		List<Quiz> quizzes = new ArrayList<Quiz>();
		quizzes.add(new Quiz("Q1"));
		quizzes.add(new Quiz("Q2"));
		quizzes.add(new Quiz("Q3"));
		quizzes.add(new Quiz("Q4"));
		
		Quiz quiz5 = new Quiz("Q5");
		Question newQuestion = new Question();
		newQuestion.setQuestionText("What is 10 divided by 5?");
		List<Answer> possibleAnswers = new ArrayList<Answer>();
		possibleAnswers.add(new Answer("2", true));
		possibleAnswers.add(new Answer("3", false));
		possibleAnswers.add(new Answer("4", false));
		possibleAnswers.add(new Answer("5", false));
		newQuestion.setPossibleAnswers(possibleAnswers );
		
		quiz5.addQuestion(newQuestion );
		quizzes.add(quiz5);
		return quizzes;
	}
}
