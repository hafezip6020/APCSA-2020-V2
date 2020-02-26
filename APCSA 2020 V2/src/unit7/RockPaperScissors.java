package unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		playChoice = "R";
		compChoice = "P";
	}

	public RockPaperScissors(String player, String computer)
	{
		playChoice = player;
		compChoice = computer;
	}

	public void setPlayers(String player,  String computer)
	{
		playChoice = player;
		compChoice = computer;
	}

	public String determineWinner()
	{
		String winner="";
		if(playChoice.equals("R")) {
			if(compChoice.equals("R")) 
				winner = "Draw";
			if(compChoice.equals("P"))
				winner = "Computer";	
			if(compChoice.equals("S"))
				winner = "Player";
		} else if(playChoice.equals("P")) {
			if(compChoice.equals("R")) 
				winner = "Player";
			if(compChoice.equals("P"))
				winner = "Draw";	
			if(compChoice.equals("S"))
				winner = "Computer";
		} else {
			if(compChoice.equals("R")) 
				winner = "Computer";
			if(compChoice.equals("P"))
				winner = "Player";	
			if(compChoice.equals("S"))
				winner = "Draw";
		}
		return winner;
	}

	public String toString()
	{
		String output1="\nPlayer had " + playChoice + "\nComputer had " + compChoice ;
		String output2= "";
		
		if(determineWinner().equals("Player")) {
			if(playChoice.equals("S")) {
				output2 = "\n!Player wins <<Scissors Cut Papers>>!";
			} else if(playChoice.equals("R")) {
				output2 = "\n!Player wins <<Rocks Break Scissors>>!";
			} else if(playChoice.equals("P")) {
				output2 = "\n!Player wins <<Papers Cover Rocks>>!";
			}
		} else if(determineWinner().equals("Computer")) {
			if(compChoice.equals("S")) {
				output2 = "\n!Computer wins <<Scissors Cut Papers>>!";
			} else if(compChoice.equals("R")) {
				output2 = "\n!Computer wins <<Rocks Break Scissors>>!";
			} else if(compChoice.equals("P")) {
				output2 = "\n!Computer wins <<Papers Cover Rocks>>!";
			}
		} else {
			output2 = "\n!Draw";
		}
		return output1 + output2;
	}
}