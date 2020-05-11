package winter;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Tree extends AbstractShape 
{

	public Tree(int x, int y, int wid, int ht) {
		super(x, y, wid, ht);
	}

	@Override
	public void draw(Graphics window) {
		int x = getXPos();
		int y = getYPos();
		int w = getWidth();
		int h = getHeight();
		
		window.setColor(Color.gray);
		window.fillRect(x-(w/4), y, w/2, h);
		window.setColor(Color.green);
		window.fillPolygon(new int[] {x+(w/2), x, x-(w/2)}, new int[] {y, y-h/2, y}, 3);

	}

	@Override
	public void moveAndDraw(Graphics window) {
		draw(window);
	}

}