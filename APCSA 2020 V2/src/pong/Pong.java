//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package pong;
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

@SuppressWarnings("serial")
public class Pong extends Canvas implements KeyListener, Runnable
{
	/**
	 * 
	 */
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int leftScore, rightScore;


	public Pong()
	{
		//set up all variables related to the game

		ball = new SpeedUpBall(300, 300, 10, 10, Color.black,5,5);
		//ball = new BlinkyBall(300, 300, 10, 10, Color.black,2,2);
		leftPaddle = new Paddle(20, 300, 20, 100, Color.red, 5);
		rightPaddle = new Paddle(740, 300, 20, 100, Color.blue, 5);
		leftScore =0;
		rightScore = 0;
		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
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


		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
	    rightPaddle.draw(graphToBack);
	    graphToBack.drawString("LeftScore:  " +  leftScore, 100, 40);
		graphToBack.drawString("RightScore:  " +  rightScore, 620, 40);
		//see if ball hits left wall or right wall

		if(ball.getX()<=10)
		{
			ball.setXSpeed(-ball.getXSpeed());
			rightScore = rightScore+1;
			ball.moveHomeAndDraw(graphToBack);
		}
		
		if(ball.getX()>=770)
		{
			ball.setXSpeed(-ball.getXSpeed());
			leftScore = leftScore+1;
			ball.moveHomeAndDraw(graphToBack);
		}

		if(!(ball.getY()>=10 && ball.getY()<=450))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}



		//see if the ball hits the left paddle
		
		if (ball.didCollideLeft(leftPaddle)) {
			ball.setXSpeed(-ball.getXSpeed());
		}
	
		//see if the ball hits the right paddle
		if (ball.didCollideRight(rightPaddle)) {
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		
		
		


		//see if the paddles need to be moved

		if(keys[0] == true)
		{
			//move left paddle up and draw it on the window
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		
		if(keys[1] == true)
		{
			//move left paddle down and draw it on the window
			leftPaddle.moveDownAndDraw(graphToBack);
		}
		
		if(keys[2] == true)
		{
			//move right paddle up and draw it on the window
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		
		if(keys[3] == true)
		{
			//move right paddle down and draw it on the window
			rightPaddle.moveDownAndDraw(graphToBack);
		}

		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}