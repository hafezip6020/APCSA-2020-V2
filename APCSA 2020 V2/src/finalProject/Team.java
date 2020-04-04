package finalProject;

import java.util.ArrayList;

public class Team
{
	
	String team;
	private ArrayList<Player> rosterList;


public Team()
{
	team="";
	rosterList=new ArrayList<Player>();
}	
public Team (String name)
{
	team = name;
	rosterList=new ArrayList<Player>();		
}
public void addPlayer(Player p)
{
	rosterList.add(p);
}

public Player getTeamPlayer(int n) {
	return rosterList.get(n);
}
public void setPlayer(int pos, Player p)
{
	rosterList.set(pos, p);
}
public void setTeamName(String name)
{
	team=name;
}	
   
public String getTeamName() {
    return team;
}

public int getTeamSize() {
	return rosterList.size();
}

public String toString() {
	
	String roster = "";
	for(int i =0; i<rosterList.size();i++) {
		roster = roster + "\n" + rosterList.get(i);
	}
	return roster;
}
}