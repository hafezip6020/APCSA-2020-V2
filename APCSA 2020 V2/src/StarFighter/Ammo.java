//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package StarFighter;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;

	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		this(x,y,0);
	}

	public Ammo(int x, int y, int s)
	{
		super(x,y,10,10);
		speed = s;
	}

	public void setSpeed(int s)
	{
		speed = s;	
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		window.setColor(Color.yellow);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	
	public void move( String direction )
	{
		if (direction.equalsIgnoreCase("Up")) {
			setY(getY() - getSpeed());
		}
		
		if (direction.equalsIgnoreCase("Down")) {
			setY(getY() + getSpeed());
		}
		
	}
	
        public boolean alienHit (Object obj) {
       	Alien a = (Alien) obj;
       
    	if(this.getX()>a.getX() && this.getX()< a.getX() + a.getWidth()) 
    		if(this.getY() < a.getY() + a.getHeight() && this.getY() > a.getY()) {
    			a.setLife(false);
    			return true;
    	}
    	
    	return false;
    	
    }

	public String toString() {
	
		return super.toString() + " " + getSpeed();
	}
}
