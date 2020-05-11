//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package winter;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;

public class WinterScenePanel extends JPanel implements Runnable
{
	private List<AbstractShape> shapes;
	private AbstractShape sMan;

	public WinterScenePanel()
	{
		setVisible(true);
		//refer shapes to a new ArrayList of AbstractShape
		shapes = new ArrayList<AbstractShape>();
		
		//populate the list with 50 unique snowflakes
		
		for (int i=0; i<50; i++) {
			int x = (int) (750 * Math.random());
			int y = (int) (600 * Math.random());
			int w = (int) (40 * Math.random())+15;
			int h = (int) (40 * Math.random())+15;
			int ySpd = (int) (5*Math.random()) + 1;
			shapes.add(new FancySnowFlake(x,y,w,h,Color.white,0,ySpd));
		}

		//instantiate a snowman
		shapes.add(new SnowMan(300,300,100,200));
		shapes.add(new Tree(100,100,50,80));
		new Thread(this).start();
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	public void paint(Graphics window)
	{
		window.setColor(Color.BLUE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.WHITE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("MAKE A WINTER SCENE!",40,40);

		//make the snowman appear
		//make the snowflakes appear and move down the screen
		for (AbstractShape object : shapes) {
			object.moveAndDraw(window);
			
			//check to see if any of the snowflakes need to be reset to the top of the screen
			if (object.getYPos() > 600) {
				object.setYPos(0 - object.getHeight());
			}
		}
	}
	

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(35);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}