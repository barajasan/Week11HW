
public class Week11HW {
	private int roll;
	private static int OneThrow; 
	private int maxSide = 7; 
	
	public Week11HW() 
	{
		Throw();
	}
	
	public Week11HW (int bounces)
	{
		Throw(bounces);
	}
	
	public void Throw() 
	{
		roll = 1 + (int)(Math.random()*7);
	}
	
	public void Throw(int bounces) 
	{
		for (int i = 1; i < bounces + 1; i++)
		{
			roll = roll + 1 + (int)(Math.random()*7);
			System.out.println(roll);
		}
		roll = roll / bounces;
	}
	
	public void Throw (int dices, int bounces) 
	{
		maxSide = maxSide * dices; 
		for (int i = 1; i < bounces + 1; i++)
		{
			roll = roll + 1 +(int)(Math.random()*maxSide);
			System.out.println(roll);
		}
		roll = roll / bounces;
	}
	
	public int Value() 
	{
		return roll;
	}
	
	public static int OneThrow()
	{
		OneThrow = 1 + (int)(Math.random()*7);
		return OneThrow;
	}
	


}
