package unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		
		String csPossible = "RPS";
		Random csRandom = new Random();
		String i = "y";
		//add in a do while loop after you get the basics up and running
		while( i.equals("y") ) {
			String player = "";
			out.print("type in your prompt [R,P,S] :: ");
			player = keyboard.next();
			char tmp = csPossible.charAt(csRandom.nextInt(csPossible.length()));
			String Computer = String.valueOf(tmp);
			
			RockPaperScissors game = new RockPaperScissors();
			game.setPlayers(player, Computer);
			System.out.print(game.toString());
			
			out.print("\nDo you want to continue playing [y = yes ; n = no] :: ");
			i = keyboard.next();
		}

	}
}



