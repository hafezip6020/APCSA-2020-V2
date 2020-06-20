package Discrete_1;

import java.util.ArrayList;
import java.util.List;

import unit10.Toy;

public class PowerSet
{
	private String set;
	private int cardinality;
	private ArrayList<Sets> PowerList;
	
	public PowerSet(String set) {
		this.set = set;	
		cardinality = getCardinality();
		PowerList = new ArrayList<Sets>();
		
		for(int i=0; i<set.length(); i++) {
			
		}
		
		
	}
	
	public int getCardinality() {
		cardinality = 0;
		for(int i=0; i<set.length(); i++) {
			if(set.substring(i,i+1).equals(",")) {
				cardinality++;
			}
		}
		return cardinality;
	}
	
	
	
	
   
}