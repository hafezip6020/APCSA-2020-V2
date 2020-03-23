package unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.ArrayList; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int num;
	private int den;
	//write two constructors
	public Rational() {
		num = 1;
		den = 1;
	}
	
	public Rational(int numOne, int numTwo) {
		num = numOne;
		den = numTwo;		
	}

	//write a setRational method
	public void setRational(int numOne, int numTwo) {
		num = numOne;
		den = numTwo;		
	}
	

	//write  a set method for numerator and denominator
	public void setNum(int numOne) {
		num = numOne;		
	}
	
	public void setDen(int numOne) {
		den = numOne;		
	}
	
	public int getNumerator () {
		return num; 
	}
	
	public int getDenominator () {
		return den; 
	}
	
	public void add(Rational  other)
	{
		int num2 = other.getNumerator();
		int den2 = other.getDenominator();
		
		num =  num * den2 + num2 * den;
		den = den * den2;
		
		reduce();
	}

	private void reduce()
	{
		int gcd = gcd(num, den);
		num = num / gcd;
		den = den / gcd;

	}

	private int gcd(int numOne, int numTwo)
	{
		int min = Math.min(numOne, numTwo);
		for (int x = min; x>1; x--) {
			if(numOne % x == 0 && numTwo % x == 0) {
				return x;
			}
		}
		return 1;
	}

	public Object clone ()
	{
		return new Rational(getNumerator(), getDenominator());
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	
	public boolean equals( Object obj)
	{
		if((double)num / den == (double)((Rational) obj).getNumerator()/((Rational)obj).getDenominator()) {
			return true;
		}

		return false;
		
	}

	public int compareTo(Rational other)
	{
		if((double)num / den > (double)other.getNumerator()/other.getDenominator()){
			return 1;
		}

		return -1;

		
	}



	
	//write  toString() method
	public String toString() {
		return num + "/" + den;
	}
	
}