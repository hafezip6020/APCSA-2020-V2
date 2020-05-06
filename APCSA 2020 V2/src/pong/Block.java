//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package pong;
import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		xPos=100;
		yPos=100;
		width=10;
		height=20;
		color= Color.black;

	}
	
	public Block(int x, int y)
	{
		xPos=x;
		yPos=y;
		width=10;
		height=20;
		color= Color.black;
	}
	
	public Block(int x, int y, int w, int h)
	{
		xPos=x;
		yPos=y;
		width=w;
		height=h;
		color= Color.black;
	}
	
	public Block(int x, int y, int w, int h, Color c)
	{
		xPos=x;
		yPos=y;
		width=w;
		height=h;
		color=c;


	}

	//add other Block constructors - x , y , width, height, color
//add the other set methods
   public void setxPos(int x)
   {
	   xPos=x;
   }
   public void setyPos(int y)
   {
	   yPos=y;
   }
   public void setWidth(int w)
   {
	   width=w;
   }
   public void setHeigt(int h)
   {
	   height=h;
   }
   public void setColor(Color c)
   {
	   color=c;
   }

   
   
   
// return method
   public int getXPos()
   {
	   return xPos;
   }
   public int getYPos()
   {
	   return yPos;
   }
   public int getWidth()
   {
	   return width;
   }
   public int getHeight()
   {
	   return height;
   }
   public Color getColor()
   {
	   return color;
   }
   
   
   
   
   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());

   }
   
	public boolean equals(Object obj)
	{
		Block block2 = (Block) obj;
		if(xPos == block2.getXPos())
			if(yPos == block2.getYPos())
				if (height == block2.getHeight()) {
					if (width == block2.getWidth()) {
						if (color == block2.getColor()) {
							return true;
				}
			}
		}
		return false;
	}   

   //add the other get methods
    

   //add a toString() method  - x , y , width, height, color
	public String toString() {
		return xPos + ", " + yPos + ", " + width + ", " + height + ", " + color;
	}

@Override
public void setPos(int x, int y) {
	// TODO Auto-generated method stub
	xPos =x;
	yPos = y;
}

@Override
public void setX(int x) {
	// TODO Auto-generated method stub
	xPos=x;
}

@Override
public void setY(int y) {
	// TODO Auto-generated method stub
	yPos =y;
}

@Override
public int getX() {
	// TODO Auto-generated method stub
	return xPos;
}

@Override
public int getY() {
	// TODO Auto-generated method stub
	return yPos;
}
}