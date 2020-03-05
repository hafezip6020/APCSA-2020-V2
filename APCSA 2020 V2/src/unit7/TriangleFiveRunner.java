package unit7;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   TriangleFive T = new TriangleFive('C',4);
	   System.out.println(T);
	   T.setLetter('A');
	   T.setAmount(5);
	   System.out.println(T.toString());
	   T.setLetter('B');
	   T.setAmount(7);
	   System.out.println(T.toString());
	   T.setLetter('X');
	   T.setAmount(6);
	   System.out.println(T.toString());
	   T.setLetter('Z');
	   T.setAmount(8);
	   System.out.println(T.toString());
	}
}