package unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.Arrays;

import elevensLab.Card;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		pups = new Dog[size];  
		//point pups at a new arry of Dog
		
	}
	
	public void set(int spot, int age, String name)
	{
		Dog d = new Dog(age, name);
		pups[spot] = d ;
		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
	}

	public String getNameOfOldest()
	{
		int tmp = 0;
		int age = pups[0].getAge();;
		for (int i = 1; i < pups.length; i++) { 
			if(pups[i].getAge()> age) {
				age = pups[i].getAge();
				tmp = i;
			}
		}
		return pups[tmp].getName();
	}

	public String getNameOfYoungest()
	{
		int tmp = 0;
		int age = pups[0].getAge();;
		for (int i = 1; i < pups.length; i++) { 
			if(pups[i].getAge()<age) {
				age = pups[i].getAge();
				tmp = i;
			}
		}
		return pups[tmp].getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}