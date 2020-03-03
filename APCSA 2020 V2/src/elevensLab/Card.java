package elevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	//instance variables
		private String suit;//String suit
		private int face;//int face

  	//constructors
		public Card() {
			suit = "HEARTS";
			face = 1;		
		}

		public Card(String s, int n) {
			suit = s;
			face = n;	
		}

	// modifiers
		//set methods
		public void setCard(String s, int n) {
			suit = s;
			face = n;	
		}
		
		public void setFace(int n) {
			face = n;	
		}

		public void setSuit(String s) {
			suit = s;
		}



  	//accessors
		//get methods
		public String getSuit() {
			return suit;
				
		}
		public String getFace() {
			return FACES[face];
			
		}


  	//toString
		public String toString() {
			String card = "";
			card = FACES[face] + " of " + suit;
			return card;
		}
 }