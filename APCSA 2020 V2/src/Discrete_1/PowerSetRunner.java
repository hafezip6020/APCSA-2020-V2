package Discrete_1;

import static java.lang.System.*;

public class PowerSetRunner
{
   public static void main(String args[])
   {
	   int[] ray = new int[5];
	   ray[0]=0;
	   String str = "A,BC,D,E,";
	   System.out.println(str);   
	   //PowerSet T = new PowerSet();
	   int num = 0, r = 1;
	   for(int i=0; i<str.length(); i++) {
			if(str.substring(i,i+1).equals(",")) {
				num++;
				str = str.substring(0,i) + str.substring(i+1);
				ray[r] = i;
				r++;
			}
		}
		if(num>0)
			num--;
		
		
		
	 
	 for(int i=0; i<ray.length;i++)
		  System.out.println(ray[i]);
	 System.out.println("New");
	 for(int i=0; i<ray.length-1;i++)
		  System.out.println(ray[i+1]-ray[i]);
	 /*System.out.println("\n\nNew");
	 for(int i=0; i<str.length();i++)
		   for(int c=1; c <=str.length();c++) {
			   if(c+i<=str.length())
			   System.out.println(str.substring(i, i+c));}
	 System.out.println("New");
	 
	 for(int i=0; i<1;i++) {
		  if(i<ray.length-1)
			  //i=i+(ray[i+1]-ray[i]);
		  //System.out.println(str.substring(i) + i);
		  for(int c=1; c <=str.length();c++) {
			   if(c+i<=str.length())
			   System.out.println(str.substring(i, i+c));}
		  }
	 		
	  
	  /*int t=0 ,q=0;
	  for(int i=0; i<ray.length;i++) {
		  t=(ray[i+1]-ray[i])-1;
		   for(int c=1; c <=ray.length;c++) {
			   q=(ray[i+1]-ray[i])-1;
			   if(c+i+q<=ray.length)
			   System.out.println(str.substring(i, i+c+q));
			   }
		   System.out.println(i);
		   i=i+t;
		   }
	  /*
			   
			   
			   
			   //for(int c=1; c <=ray.length;c++) {
			//  if(c+i<=ray.length)
				//  System.out.println(str.substring(i, i+c));
		   }*/
	   
	}
}
