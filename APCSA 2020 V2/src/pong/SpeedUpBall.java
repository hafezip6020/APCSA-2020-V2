//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package pong;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends Ball
{

   private int speed2;

   public SpeedUpBall()
   {


   }

   public SpeedUpBall(int x, int y)
   {
	   super(x,y);


   }


   public SpeedUpBall(int x, int y, int xSpd, int ySpd)
   {
	   super(x,y,xSpd,ySpd);


   }

   public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {
	   super (x,y,wid,ht,xSpd,ySpd);


   }


   public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
	   super(x,y,wid,ht,col,xSpd,ySpd);



   }
@Override 
   public void setXSpeed( int xSpd )
   {
	   if (xSpd > 0)
		   speed2 = xSpd+2;
	   else if (xSpd < 0)
		   speed2 = xSpd-2;
	   
	   super.setXSpeed(speed2);

   }
@Override 
   public void setYSpeed( int ySpd )
   {

	   if (ySpd > 0)
		   speed2 = ySpd+2;
	   else if (ySpd < 0)
		   speed2 = ySpd-2;
	   
	   super.setYSpeed(speed2);

   }
}

