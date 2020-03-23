package unit10;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore1
{
	private ArrayList<Toy> toyList;

	public ToyStore1()
	{
		toyList = new ArrayList<Toy>();
	}

	public ToyStore1(String toys) {
		 loadToys(toys);
	}
	public void loadToys( String toys )
	{
		toyList = new ArrayList<Toy>();
		int c = 0;
		String[] words = toys.split("\\W+");
		for(int i = 0; i < words.length; i++) {
			String t = words[i];
			Toy x = new Toy(t);
			int indexOfX = getThatToyIndex(t);
			if (indexOfX == -1) {
				toyList.add(x);
				toyList.get(c).setCount(1);
				c = c + 1;
			} else if (indexOfX != -1) {
				int q =toyList.get(indexOfX).getCount();
				toyList.get(indexOfX).setCount(q+1);
			}
		
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for(int i = 0; i < toyList.size(); i++) {
            if (toyList.get(i).getName().equals(nm)){
                return toyList.get(i);
            }
        }
  		return null;
  	}
  	
  	public int getThatToyIndex( String nm )
  	{
  		for(int i = 0; i < toyList.size(); i++) {
            if (toyList.get(i).getName().equals(nm)){
                return i;
            }
        }
  		return -1;
  	}
  	
  
  	public String getMostFrequentToy()
  	{
  		int mft = 0;
  		int indexOfMft = 0;
  		for (int i = 0; i < toyList.size(); i++) {
  			if(toyList.get(i).getCount()>mft) {
  				mft = toyList.get(i).getCount();
  				indexOfMft = i;
  			}
  		}
  		return toyList.get(indexOfMft).getName();
  	}  
  
  	public void sortToysByCount()
  	{
  		Collections.sort(toyList, Collections.reverseOrder());
  	}  
  	  
  	
	public String toString()
	{
	   return toyList + "";
	}
	
	public String myName(){
		System.out.println("Parsa Hafezi");
		}
<<<<<<< HEAD
}
=======
}
>>>>>>> branch 'master' of https://github.com/hafezip6020/APCSA-2020-V2
