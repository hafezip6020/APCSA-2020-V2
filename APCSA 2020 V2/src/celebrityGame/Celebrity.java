package celebrityGame;


/**
 * Celebrity base class for the Celebrity game.
 * @author cody.henrichsen
 * @version 1.4 17/09/2018
 */
public class Celebrity
{
	String clue;
	String name;
	String type;
	/**
	 * The clue to determine the celebrity
	 */
	
	/**
	 * The answer or name of the celebrity.
	 */
	
	/**
	 * Creates a Celebrity instance with the supplied answer and clue
	 * @param answer
	 * @param clue
	 */
	public Celebrity(String answer, String hint)
	{
		name = answer;
		clue = hint;
	}
	public Celebrity(String answer, String hint, String form)
	{
		name = answer;
		clue = hint;
		type = form;
	}
	/**
	 * Supplies the clue for the celebrity
	 * @return
	 */
	public String getClue()
	{
		return clue;
	}

	/**
	 * Supplies the answer for the celebrity.
	 * @return
	 */
	public String getAnswer()
	{
		return name;
	}
	
	public String getType()
	{
		return type;
	}

	/**
	 * Updates the clue to the provided String.
	 * @param clue The new clue.
	 */
	public void setClue(String hint)
	{
		clue = hint;
	}

	/**
	 * Updates the answer to the provided String.
	 * @param answer The new answer.
	 */
	public void setAnswer(String answer)
	{
		name = answer;
	}
	
	
	public void setType(String form)
	{
		type = form;
	}
	
	/**
	 * Provides a String representation of the Celebrity.
	 */
	@Override
	public String toString()
	{
		return name + " " + clue + " " + type;
	}
	
}
