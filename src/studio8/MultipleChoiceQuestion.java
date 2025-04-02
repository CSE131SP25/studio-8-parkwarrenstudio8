package studio8;

import support.cse131.NotYetImplementedException;

public class MultipleChoiceQuestion extends Question {

	private String[] choices;
	/**
	 * Constructor
	 * @param prompt
	 * @param answer
	 * @param points
	 * @param choices
	 */
		
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		// Call the super class constructor, then create and set
		// instance variables for any values that aren't handled
		// by the base class
		//throw new NotYetImplementedException();
		
		super(prompt, answer, points);		
		this.choices = choices;
		
	}
	
	/**
	 * Display the prompt for the question in addition to 
	 * the choices present for the question.
	 */
	public void displayPrompt(String prompt) {
		//throw new NotYetImplementedException();
		
		System.out.println(prompt);
		for(int i = 1; i <= choices.length; i++)
		{
			System.out.println( i + ". " + choices[i]);
		}
		
		
	}
	
	/**
	 * Getter method for the available choices
	 * @return String[] of choices
	 */
	public String[] getChoices() {
		//throw new NotYetImplementedException();
		for(int i = 0; i < choices.length; i++)
		{
			
		}
	}
	
	public static void main(String[] args) {
		// TODO: create your own MultipleChoiceQuestion
		Question q2 = new MultipleChoiceQuestion("how are you?", "good", 5, choices["good", "bad", "fine", "sad"]);
	}

}
