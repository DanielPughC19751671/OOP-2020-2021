package ie.tudublin;

public class Animal
{

	/*Variable declaration */
	private String name;
	private int numLives;
	
	/*implementing toString method. */
	public String toString()
    {
        return name;
    }// end toString.
	
  
	/* Implementing getters and setters. */
	/* String name */
    public String getName()
    {
        return name;
    }// end getter.

    public void setName(String name)
    {
        this.name = name;
    }// end setter.
	
    public Animal(String name)
    {
        this.name = name;
    }
	
	/* Implementing getters and setters. */
	/* int numLives. */
	
	public int getNumLives()
	{
		return numLives;
	}// end  getter. 
	
	public void setNumLives(int numLives)
	{
		this.numLives = numLives;
	}// end setter. 
	public Animal(int numLives)
    {
        this.numLives = numLives;
    }
	
	
	/* Initalising methods. */
	public void kill()
	{
		if(numLives >0 )
		{
			numLives--;
			System.out.println("Ouch!");
		}// end if.
		else
		{
			System.out.println("Dead");
		}// end else.
	}// end kill method. 
}// end class.  