package unit5;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{ 
	   int length = a.length();
	   String first = a.toLowerCase().substring(0,1);
	   String last = a.toLowerCase().substring(length -1);
	   if (first.equals("a") || first.equals("e") || first.equals("i") || first.equals("o") || first.equals("u") || last.equals("a") || last.equals("e") || last.equals("i") || last.equals("o") || last.equals("u")) {
		   	return "yes";
	   }else {
		   return "no";
	   }
	}
}

