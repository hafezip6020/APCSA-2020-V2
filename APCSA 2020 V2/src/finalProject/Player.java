package finalProject;

public class Player
{
	String name;
	String team;
	String position;
	float OR;
	float DR;

	public Player () {
		
	}

	public Player (String n, String  t, String p, float Off, float Def) {
		name = n;
		team = t;
		position = p;
		OR = Off;
		DR = Def;
		
	}

public String getName() {
	return name;
}

public void setName(String n) {
	name = n;
}
   
public String getTeam() {
    return team;
}
public void setTeam(String t) {
        team = t;
}

public String getPosition() {
	return position;
}

public void setPosition(String p) {
	position = p;
}

public float getOffensiveRating() {
        return OR;
}
public void setOffensiveRating(float r) {
        OR = r;
}
public float getDeffensiveRating() {
    return DR;
}
public void setDeffensiveRating(float r) {
    DR = r;
}

public float getOverallRating () {
	return (DR + OR)/2;
	
}

@Override
public String toString() {

	return "Player [name = " + name + ", Team = " + team + ", Position = " + position + ", Offensive Rating = " + OR + ", Defensive Rating = " + DR + " ]";	    
}
}



	
