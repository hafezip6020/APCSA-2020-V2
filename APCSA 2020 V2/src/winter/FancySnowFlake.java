//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package winter;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import pong.Block;

//extend the AbstractShape class to make a FancySnowFlake class
public class FancySnowFlake extends AbstractShape {
	
	public FancySnowFlake(int x, int y, int w, int h, Color col, int xSpd, int ySpd) {
		super(x, y, w, h, col, xSpd, ySpd);
	}
	
	@Override
	public void draw(Graphics window) {
		// TODO Auto-generated method stub
		int x = getXPos();
		int y = getYPos();
		int w = getWidth();
		int h = getHeight();
		
		window.setColor(getColor());
		
		window.drawLine(x+(w/2),y, x-(w/2),y);
		window.drawLine(x,y+(h/2),x,y-(h/2));
		window.drawLine(x+(w/3),y+(h/3),x-(w/3),y-(h/3));
		window.drawLine(x-(w/3),y+(h/3),x+(w/3),y-(h/3));
		window.drawOval(x, y, w/6, h/6);
		window.drawOval(x, y, w/8, h/8);
	}
	
	public void draw(Graphics window, Color col) {
		int x = getXPos();
		int y = getYPos();
		int w = getWidth();
		int h = getHeight();
		
		window.setColor(col);
		
		window.drawLine(x+(w/2),y, x-(w/2),y);
		window.drawLine(x,y+(h/2),x,y-(h/2));
		window.drawLine(x+(w/3),y+(h/3),x-(w/3),y-(h/3));
		window.drawLine(x-(w/3),y+(h/3),x+(w/3),y-(h/3));
		window.drawOval(x, y, w/6, h/6);
		window.drawOval(x, y, w/8, h/8);
	}

	@Override
	public void moveAndDraw(Graphics window) {
		  draw(window, Color.blue);

	      setXPos(getXPos()+getXSpeed());
			//setY
	      setYPos(getYPos()+getYSpeed());
			//draw the ball at its new location
	      draw(window);
		}
		

}


