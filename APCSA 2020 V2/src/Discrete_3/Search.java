package Discrete_3;

import java.util.Arrays;
import java.util.Scanner;

public class Search
{
	static int ternarySearch(int ray[], int l, int r, int x) 
	{
		// find the dividing pointers to get 3 groups
		int midFirst = l + (r-l)/3;
		int midSecond = midFirst + (r-l)/3;
		// if either of the pointer is equal to key return the index
		if(ray[midFirst]==x) {
			return midFirst;
		}
		
		if(ray[midSecond]==x) {
			return midSecond;
		}
		// Determine which group the key falls 
		//into and recall the method with smaller bounds
		if(x < ray[midFirst]) {
			return ternarySearch(ray, l, midFirst, x);
		}
		if (x > ray[midSecond]) {
			return ternarySearch(ray, midSecond +1 , r, x);
		}	
		if( x > ray[midFirst] && x < ray[midSecond]) {
			return ternarySearch(ray, midFirst , midSecond, x);
		}
		
		return -1;
	}
	
	static int binarySearch(int ray[], int l, int r, int x) 
	{
		// determine the pointer to divide array into two groups 
		int mid = l + (r+1)/2;
		// if the pointer is equal to key return the index
			if(ray[mid]==x) {
				return mid;
			}
			// Determine which group the key falls 
			//into and recall the method with smaller bounds
			if(x < ray[mid]) {
				return binarySearch(ray, l, mid, x);
			}
			if (x > ray[mid]) {
				return binarySearch(ray, mid+1, r, x);
			}
		return -1;
	}
	
	static int linearSearch(int ray[], int x) 
	{// a for loop and check that every value of 
		for(int i = 0; i < ray.length; i++) 
	    { 
	        if(ray[i] == x) 
	            return i; 
	    } 
	    return -1;
	}
		
	public static void main( String[] args )
	{ 
		//the main 
		int [] ray = {1,2,3,4,5,10,16,23,31,40};
		int key = 3;
		
		System.out.println(ternarySearch(ray,0,ray.length,key));
		System.out.println(binarySearch(ray,0,ray.length,key));
		System.out.println(linearSearch(ray,key));
	}
}
