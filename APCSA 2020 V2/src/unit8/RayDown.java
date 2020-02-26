package unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(int[] numArray)
	{
		int size = numArray.length-1;
		boolean boo = true;
		for (int i = 0; i<size; i++) {
			if (numArray[i] <= numArray[i+1]) {
				boo = false;
				break;
				
			}
		}
		return boo;
	}	

}