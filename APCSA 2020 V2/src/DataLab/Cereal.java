package DataLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cereal {
	private String name;
	private float calories;
	private double rating;
	
	 public String getName() {
	        return name;
	    }
	    public void setName(String n) {
	       name = n;
	    }
	    public float getCalories() {
	        return calories;
	    }
	    public void setCalories(float c) {
	        calories = c;
	    }
	    public double getRating() {
	        return rating;
	    }
	    public void setRating(double r) {
	        rating = r;
	    }
	    @Override
	    public String toString() {
		return "Cereal [name = " + name + ", Calories = " + calories + ", Rating = " + rating + "]";	    
		}
	
	public Cereal () {
	}
	public Cereal (String n, float c, double r) {
		name = n;
		calories = c;
		rating = r;
	}
	public static Cereal BestCereal(ArrayList<Cereal> celArray) {
		float cal;
		double rating = 0; 
		int index = 0;
		ArrayList<Cereal> cerealTmp = new ArrayList<Cereal>();
		for (int i = 0; i<celArray.size();i++) {
			cal = celArray.get(i).getCalories();
			if(cal <= 110) {
				cerealTmp.add(celArray.get(i));
			}
		}
		for (int i = 0; i<cerealTmp.size();i++) {
			if(rating < cerealTmp.get(i).getRating()) {
				rating = cerealTmp.get(i).getRating();
				index = i;
			}
		}
		
		return cerealTmp.get(index);
		
	}
	
	public static void main(String[] args) {
		Scanner csvScanner;
		try {
			csvScanner = new Scanner(new File("src/dataLab/cereal2.csv"));
			Scanner valueScanner = null;
			
			ArrayList<Cereal> cerealArray = new ArrayList<Cereal>();
			int index = 0;
			while (csvScanner.hasNextLine()) {
			    valueScanner = new Scanner(csvScanner.nextLine());
			    valueScanner.useDelimiter(",");
			    Cereal cereal = new Cereal();

			    while (valueScanner.hasNext()) {
				String data = valueScanner.next();
				if (index == 0){
				    cereal.setName(data);
				}
				else if (index == 3){
				    cereal.setCalories(Float.parseFloat(data));
				}
				else if (index == 15){
				    cereal.setRating(Double.parseDouble(data));
				}
				index++;
			    }
			    index = 0;
			    cerealArray.add(cereal);
			}

			csvScanner.close();
			for (int i = 0; i<cerealArray.size();i++) {
				System.out.println(cerealArray.get(i));
			}
			System.out.println("\nThe best cereal is ");
			System.out.println(BestCereal(cerealArray));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	    }
}

	