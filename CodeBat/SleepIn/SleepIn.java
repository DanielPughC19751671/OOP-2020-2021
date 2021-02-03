/*
The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. 
We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.*/

/*refernece: https://codingbat.com/prob/p187868	*/
/*author: Daniel Pugh.*/

class main {
	
	public static void main(String[] args)
	{
		public boolean sleepIn(boolean weekday, boolean vacation) 
		{
		
			if (!weekday || vacation) {
			return true;
		}// end if. 
	  
		/*explaintation: if its not a week day or a vaction we dont sleep in other wise we do. */
		return false;
		// Solution notes: better to write "vacation" than "vacation == true.
		// though they mean exactly the same thing.
		// Likewise "!weekday" is better than "weekday == false".
		// This all can be shortened to: return (!weekday || vacation);
		// Here we just put the return-false last, or could use an if/else.
		}	
	}
}