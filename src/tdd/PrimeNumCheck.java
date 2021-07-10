package tdd;

public class PrimeNumCheck {

	
	public static boolean  isprime(int num)
	{
		
		
		int temp;
		boolean flag=true;
		for(int i=2;i<=num/2;i++)
		{
			temp=num%i;
			if(temp==0)
			{
				flag=false;
				break;
			}
					
		}
		return flag;
	}
}
