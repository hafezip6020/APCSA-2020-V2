//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package pong;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyListener;

public class Ball extends Block implements Collidable {
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y)
	{
		super(x,y);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int w, int h) {
		super (x,y,w,h);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int w, int h, int xSpd, int ySpd) {
		super (x,y,w,h);
		xSpeed = xSpd;
		ySpeed = ySpd;
	}
	
	public Ball(int x, int y, int w, int h, Color c) {
		super (x,y,w,h,c);
		xSpeed = 3;
		ySpeed = 1;
	}
	

	public Ball(int x, int y, int w, int h, Color c, int xSpd, int ySpd)
	{
		super(x,y,w,h,c);
		xSpeed = xSpd;
		ySpeed = ySpd;
	}
	

	//add the other Ball constructors
	
    //add the set methods
		public void setXSpeed(int xSpd) {
			xSpeed = xSpd;
		}

		public void setYSpeed(int ySpd) {
			ySpeed = ySpd;
		}
		
	//add the get methods
		public int getXSpeed() {
			return xSpeed;
		}

		public int getYSpeed() {
			return ySpeed;
		}

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   draw(window, Color.white);

      setX(getX()+xSpeed);
		//setY
      setY(getY()+ySpeed);
		//draw the ball at its new location
      draw(window);
   }
   
   public void moveHomeAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	  draw(window, Color.white);

      setPos(300,300);
      draw(window);
   }
   
	public boolean equals(Object obj)
	{
	Ball Ball2 = (Ball) obj;

	if (xSpeed == Ball2.getXSpeed() && ySpeed == Ball2.getYSpeed())
		return true;

	return false;
	}   



   //add a toString() method
	public String toString() {
		return super.toString() + " " + xSpeed + " " + ySpeed;
	}
	
	
	@Override
	public boolean didCollideLeft(Object obj) {
		Block b = (Block) obj;
		if (getX() <= b.getX() + b.getWidth() + Math.abs(getXSpeed()) && getX() >= b.getX())
			if(getY() <= b.getY() + b.getHeight() + Math.abs(getYSpeed()) && getY() >= b.getY())
			return true;
		return false;
	}

	@Override
	public boolean didCollideRight(Object obj) {
		Block b = (Block) obj;
		if (getX() + getWidth() >= b.getX() - Math.abs(getXSpeed()) && getX() + getWidth() <= b.getX() + b.getWidth())
			if(getY() <= b.getY() + b.getHeight() + Math.abs(getYSpeed()) && getY() >= b.getY())
			return true;
		return false;
	}

	@Override
	public boolean didCollideTop(Object obj) {
		Block b = (Block) obj;
		if (getY() <= b.getY())
			return true;
		return false;
	}

	@Override
	public boolean didCollideBottom(Object obj) {
		Block b = (Block) obj;
		if (getY() >= b.getY() + b.getHeight())
			return true;
		return false;
	}
}