package nl.adogan.quback.quback_runner;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import nl.adogan.quback.source.Quiz;

@RestController
public class Quizcontroller {

	@RequestMapping(method=RequestMethod.GET, value="/quiz")
	public String getQuiz() {
		return new Quiz().toString();
	}
}
