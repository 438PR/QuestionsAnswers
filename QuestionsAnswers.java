package edu.csumb.cst438fa16;

import java.util.HashMap;

/**
* A half-secretive map of questions to answers (at most one answer per question).
* Gives out random questions (keys) from the map, and
* can be queried to test if a given question maps to a given answer.
*/
public class QuestionsAnswers {
	
	// hashmap that stores the question <-> answer relationship
	public HashMap<String, String> theVault = new HashMap<String, String>();
	
	/**
	* Maps question to answer.
	*/
	void put(String question, String answer) {
		theVault.put(question, answer);
	}
	
	/**
	* Queries if question maps to answer.
	*/
	boolean testAnswer(String question, String answer) {
		return theVault.get(question).equals(answer);
	}
	
	/**
	* Gives out a random question from the key set.
	*/
	String getRandomQuestion() {
		return (String)theVault.keySet().toArray()[(int)Math.round((Math.random()*(theVault.size()-1)))];
	}
}