package FRQ4;

import java.util.ArrayList;

public class OnlinePurchaseManager
{
   //purchases stores Gizmos
   private ArrayList<Gizmo> purchases;
   
   
   //point purchases at a new ArrayList   
   public OnlinePurchaseManager()
   {
   	purchases = new ArrayList<Gizmo>();
   }
   
   
   //NOT part of the sample question
   //needed in order to type up and
   //test student code
   public void add( String m, boolean e )
   {
   	purchases.add( new Gizmo( m, e) );
   }
   
   
   //Part A
   //count the number of Gizmos made by maker
   //that are also electronic
   //must call getMaker and isElectronic
   //return the count or 0 if no matches
   public int countElectronicsByMaker(String maker)
   {   
   	//WRITE CODE HERE FOR PART A
	   int sum = 0;
	   for(int i = 0; i<purchases.size(); i++) {
		   Gizmo g = purchases.get(i);
		   if(g.getMaker().equals(maker) && g.isElectronic() == true) {
			   sum++; 
		   }
	   }
   	return sum;   	
   }
   

   //Part B
   //loop thought the list and check for matching adjacent pairs
   //return true of any adjacent [ side by side ] pairs are the same
   //to be the same the pairs must have the same maker and
   //be either electronic or non-electronic
   //you really really should use the equals method from Gizmo
   public boolean hasAdjacentEqualPair()
   {  
   	//WRITE CODE HERE FOR PART B
	   for(int i = 0; i<purchases.size()-1; i++) {
		   Gizmo Giz1 = purchases.get(i);
		   Gizmo Giz2 = purchases.get(i+1);
		   if(Giz1.getMaker().equals(Giz2.getMaker()) && Giz1.isElectronic() == Giz2.isElectronic()) {
			   return true;
		   }
	   }
   	return false;   	
   }
   
   
   //NOT part of the sample question
   //needed in order to type up and
   //test student code
   public String toString()
   {
   	return "" + purchases;
   }
}


/*Part C

OPEN-ENDED SECTION

A programmer would like to add a method getCheapestGizmoByMaker, 
which returns the least expensive Gizmo purchased by an individual 
from a given maker.

Write a description of how you would change the Gizmo and OnlinePurchaseManager 
classes in order to support this modification. 
 
Make sure to include the following in your response. 

�	Write the method header for the getCheapestGizmoByMaker method. 
	DO write code for this part.

�	Identify any new or modified variables, constants, constructors, 
   or methods aside from the getCheapestGizmoByMaker method. 
   DO NOT write code for this part.
   
�	Describe, for each new or revised variable, constant, constructor, 
   or method, how it would change or be implemented, including visibility and type. 
   You do not need to describe the getCheapestGizmoByMaker method.
   DO NOT write code for this part.
   
   Add price of Gizmo when creating the object
   Create a method that organizes the Gizmos by price and the return index zero

*/

