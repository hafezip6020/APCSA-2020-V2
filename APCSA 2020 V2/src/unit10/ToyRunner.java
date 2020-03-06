package unit10;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy t = new Toy();
		t.setName("sorry");
		t.setCount(1);
		System.out.println(t.toString());
		t.setName("gi joe");
		t.setCount(5);
		System.out.println(t.toString());
	}
}