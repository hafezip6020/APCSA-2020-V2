package unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int oddIndex = 0;
		int evenIndex = 0;
		int size = ray.length-1;
		int distance = 0;
		
		for (int i = 0; i<size; i++) {
			if (ray[i] % 2 == 1) {
				oddIndex = i+1;
				break;
			}
		}
		
		for (int i = oddIndex; i<size; i++) {
			if (ray[i] % 2 == 0) {
				evenIndex = i+1;
				break;
			}
		}
		
		
		
		distance = Math.abs(oddIndex-evenIndex);
		if (oddIndex == 0 || evenIndex == 0) {
			return -1;
		} else {
			return distance;
		}
		
	}
}