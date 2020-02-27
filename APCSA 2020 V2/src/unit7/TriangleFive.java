package unit7;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
	}

	public TriangleFive(char c, int amt)
	{
		letter = c;
		amount = amt;
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		
		for (int i = amount; i > 0; i--) {
			for (int x = 0; x<i ; x++) {
				output = output + letter;
			}
			output += " ";
			if (letter == 'Z')
				letter = 'A';
			else
				letter = (char) (letter + 1);
		}
			String output2 = output;
			int size = 0;
			int value = 2, add = 3;
			for (int i = amount; i > 0; i--) {
				output = output + "\n" + output2.substring(0, output2.length() - value);
				value = value + add;
				add =  add + 1;
			}
		
		return output;
	}
}
