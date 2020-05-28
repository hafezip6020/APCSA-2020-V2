//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package StarFighter;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>();
		for (int i=0; i<size; i++) {
			int x = 50 + (50*i)%750;
			int y = 50 + (50*i)%250;
			aliens.add(new Alien(x,y,1));
		}
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}
	
	public Alien getAlien(int i) {
		return aliens.get(i);
	}
	
	public void drawEmAll( Graphics window )
	{
		for (Alien a : aliens){
			a.draw(window);
		}
	}

	public void moveEmAll()
	{ 
		for (Alien a : aliens){
		if (a.getX() < 10) {
			a.setSpeed(-a.getSpeed());
			a.setY(a.getY() + 20);
			a.move("right");
			
		} else if (a.getX() > 780) {
			a.setSpeed(-a.getSpeed());
			a.setY(a.getY() + 20);
			a.move("right");

		} else {
			a.move("right");
		}
		}
		
	}

	public void removeDeadOnes()
	{ 
		for(Alien a : aliens) {
			if(a.getLife() == false)
				aliens.remove(a);
		}
		
	}
	
	int hordeSize() {
		return aliens.size();
	}

	public String toString()
	{
		return "";
	}
}
