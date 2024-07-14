
public class JavaIncrementDecrementExample {

	public static void main(String[] args) {
		 
		int x=10;
		int y=10;
		
		int a=15;
		int b=15;
		
		
		int res1,res2;
		int res3,res4;
		
		res1=x++;               //Increment
		res2=++y;            
		
		res3=a--;               // Decrement
		res4=--b;
		
		
		System.out.println(res1);
		System.out.println(res2);
		
		
		System.out.println(res3);
		System.out.println(res4);
		
		System.out.println(x);                  // Direct Value
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
	}

}
