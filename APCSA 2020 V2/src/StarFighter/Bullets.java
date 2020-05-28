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

public class Bullets
{
	private List<Ammo> ammo;

	public Bullets()
	{
		ammo = new ArrayList<Ammo>();
	}

	public void add(Ammo am)
	{
		ammo.add(am);
	}

	//post - draw each Ammo
	public void drawEmAll( Graphics window )
	{
		for (Ammo a : ammo){
			a.draw(window);
		}
	}

	public void moveEmAll()
	{
		for (Ammo a : ammo) {
			a.move("up");
		}
		
	}

	public void cleanEmUp()
	{
	}

	public List<Ammo> getList()
	{
		return ammo;
	}
	
	public int size() {
		return ammo.size();
	}

	public String toString()
	{
		return "";
	}

	public Ammo getBullet(int i) {
		return ammo.get(i);
	}
	public void removeBullet(int i) {
		ammo.remove(i);
	}
}
