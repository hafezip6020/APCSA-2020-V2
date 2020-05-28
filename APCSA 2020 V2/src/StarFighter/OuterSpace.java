//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package StarFighter;
import java.awt.Color;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne;
	private Alien alienTwo;

    private AlienHorde horde;
	private Bullets shots;
	private Ammo a;
	private Timer timer;
	

	private boolean[] keys;
	private BufferedImage back;
	
	private boolean fired;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other instance variables
		//Ship, Alien
		//alienOne = new Alien(200,50,50,50,0);
		//alienTwo = new Alien(150,50,50,50,0);
		horde = new AlienHorde(15);
		shots = new Bullets();
		
		
		ship = new Ship(325,400,100,100,2);
		timer = new Timer();
	
		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
		fired = false;
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		horde.moveEmAll();

		if(keys[0] == true)
		{
			ship.move("LEFT");
		}
		
		if(keys[1] == true)
		{
			ship.move("RIGHT");
		}

		if(keys[2] == true)
		{
			ship.move("UP");
		}

		if(keys[3] == true)
		{
			ship.move("DOWN");
		}
		
		if(keys[4] == true) {
		  
			if (fired == false) {
				shots.add(new Ammo(ship.getX() + (ship.getWidth()/2) ,ship.getY()+20,ship.getSpeed()+2));
				fired = true;
				timer.schedule(new TimerTask() {
					public void run() {
						fired = false;
					}
				}, 600);;
			}
		}


		//add code to move Ship, Alien, etc.

 
		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship
		//if (a)
		
		
		ship.draw(graphToBack);
		//alienOne.draw(graphToBack);
	    //alienTwo.draw(graphToBack);
	    horde.drawEmAll(graphToBack);
	    if(shots.size()>0) {
	    	shots.drawEmAll(graphToBack);
			shots.moveEmAll();
	    }
	    
	    
	    
	    for(int i = 0; i< horde.hordeSize(); i++) {
	    	if(shots.getList().isEmpty() == false) {
	    	Ammo b1 = shots.getBullet(0);
	    	if(b1.alienHit(horde.getAlien(i))){
	    		shots.removeBullet(0);
	    		horde.removeDeadOnes();
	    	}
	    }}
	    
	    for(int i = 0; i < shots.size();) {
			if(shots.getBullet(i).getY()<0) {
				shots.removeBullet(i);
			} else {
				i++;
			}
		}
	    
		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

