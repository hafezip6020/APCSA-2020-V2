package finalProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class NBA {

	public static void main(String[] args) {
		Scanner csvScanner;
		try {
			csvScanner = new Scanner(new File("src/finalProject/NBAProject.csv"));
			Scanner valueScanner = null;
			
			ArrayList<Player> playerArray = new ArrayList<Player>();
			int index = 0;
			while (csvScanner.hasNextLine()) {
			    valueScanner = new Scanner(csvScanner.nextLine());
			    valueScanner.useDelimiter(",");
			    Player player = new Player();

			    while (valueScanner.hasNext()) {
				String data = valueScanner.next();
				if (index == 0){
					player.setName(data);
				}
				else if (index == 1){
					player.setTeam(data);
				}
				else if (index == 2){
					player.setPosition(data);
				}
				else if (index == 26){
					player.setOffensiveRating(Float.parseFloat(data));
				}
				else if (index == 27){
					player.setDeffensiveRating(Float.parseFloat(data));
				}
				index++;
			    }
			    index = 0;
			    playerArray.add(player);
			}
			
			csvScanner.close();
			for (int i = 0; i<playerArray.size();i++) {
				System.out.println(playerArray.get(i));
			}
			
			ArrayList<Team> teamArray = new ArrayList<Team>();
			
			for(int i=0; i<playerArray.size(); i++)
			{
				int j =5;
				String playerTeam = playerArray.get(i).getTeam();
				for(int x = 0; x< teamArray.size(); x++) {
					String tmpTeamName = teamArray.get(x).getTeamName();
					if(playerTeam.equals(tmpTeamName)) {
						j =0;
						teamArray.get(x).addPlayer(playerArray.get(i));
					}
				}
				if (j==5) {
					teamArray.add(0, new Team(playerTeam));
					teamArray.get(0).addPlayer(playerArray.get(i));
				}
			}
			
				//theClass.addStudent(i,new Student(stuName, gradeList));
			for (int x = 0; x<teamArray.size(); x++) {
			int n = teamArray.get(x).getTeamSize(); 
	        for (int i = 0; i < n-1; i++) 
	            for (int j = 0; j < n-i-1; j++) 
	                if (teamArray.get(x).getTeamPlayer(j).getOverallRating() > teamArray.get(x).getTeamPlayer(j+1).getOverallRating()) 
	                { 
	                    // swap arr[j+1] and arr[i] 
	                    Player temp = teamArray.get(x).getTeamPlayer(j); 
	                    teamArray.get(x).setPlayer(j, teamArray.get(x).getTeamPlayer(j+1)); 
	                    teamArray.get(x).setPlayer(j+1, temp); 
	                } 
			}
			System.out.println("\n The Los Angles Clippers ");
			System.out.println(teamArray.get(6));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	    }
}