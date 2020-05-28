//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package StarFighter;
import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Alien extends MovingThing
{
	private int speed;
	private boolean life;
	private Image image;

	public Alien()
	{
		this(0,0,30,30,0);
	}

	public Alien(int x, int y)
	{
		this(x,y,30,30,0);
	}

	public Alien(int x, int y, int s)
	{
		this(x,y,30,30,s);
	}

	public Alien(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		speed=s;
		life = true;
		try
		{
			System.out.println(getClass().getResource("alien.jpg"));
			URL url = getClass().getResource("alien.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			System.out.print("Alien error");
		}
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}
	
	public void setLife(boolean l)
	{
	   life = l;
	}

	public boolean getLife()
	{
	   return life;
	}

   public void move(String direction)
	{
	   if (direction.equalsIgnoreCase("Left")) {
			setX(getX() - getSpeed());
		}
		
		if (direction.equalsIgnoreCase("Right")) {
			setX(getX() + getSpeed());
		}
		
		if (direction.equalsIgnoreCase("Up")) {
			setY(getY() + getSpeed());
		}
		
		if (direction.equalsIgnoreCase("Down")) {
			setY(getY() - getSpeed());
		}	
	}
   
   
   
   	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return "";
	}
}
