package elevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	//instance variables
		private String suit;
		private String rank;//String suit
		private int face;//int face
		private int pointValue;

  	//constructors
		public Card() {
			suit = "HEARTS";
			face = 1;		
		}
		

		public Card(String s, int f) {
			suit = s;
			face = f;	
		}
		
		public Card(String r, String s, int pv){
			rank = r;
			suit = s;
			pointValue = pv;
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
		public void setRank(String r) {
			rank = r;	
		}		
		public void setPointValue(int pv) {
			pointValue = pv;	
		}
		
		

  	//accessors
		//get methods
		public String getSuit() {
			return suit;
				
		}
		public String getFace() {
			return FACES[face];
		}
		public String getRank() {
			return rank;
		}
		public int getPointValue() {
			return pointValue;
		}
		
	//matches
		public boolean matches(Card a) {
			if(suit == a.suit)
				if(rank == a.rank)
					if (pointValue == a.pointValue) {
						return true;
					}
			return false;
		}

  	//toString
		public String toString() {
			String card = "";
			card = rank + " of " + suit + " (point value = " + pointValue+ ")";
			return card;
		}
 }