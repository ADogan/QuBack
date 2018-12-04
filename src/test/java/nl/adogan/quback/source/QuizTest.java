package nl.adogan.quback.source;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class QuizTest {
	
	private Quiz objectUnderTest;
	
	@Test
	public void testQuestionsAmount() {
		//prepare
		objectUnderTest = new Quiz();
		
		Question question = new Question();
		
		List<Question> questions = new ArrayList<Question>();
		questions.add(question);
		
		//pretest verification
		assertEquals(0, objectUnderTest.getQuestions().size());
		
		//test
		objectUnderTest.setQuestions(questions);
		
		//verify
		assertEquals(1, objectUnderTest.getQuestions().size());
	}
	
	@Test
	public void testDefaultQuizName() {
		//prepare
		objectUnderTest = new Quiz();
		
		//verify
		assertEquals("empty quizname", objectUnderTest.getQuizName());
		
	}

}
