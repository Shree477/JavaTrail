
public class LargestNumber {

	public static void main(String[] args) {
 
		int x,y,z;
		
		x=25;
		y=35;
		z=23;
		
		if (x > y) {
			if (x > z)
			{
				System.out.println("Largest Number is " + x);
			} else
			{
				System.out.println("Largest Number is " + z);
			}	
		}
		else	
		{
			if (y > z)
			{
				System.out.println("Largest Number is " + y);
			}	else
			{
				System.out.println("Largest Number is " + z);
			}	
		}
			}
		}