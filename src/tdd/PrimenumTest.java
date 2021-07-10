package tdd;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimenumTest {
	@Test
	public void positiveTest()
	{
		Assert.assertTrue(PrimeNumCheck.isprime(17));  
		System.out.println("The  numer is prime");
	}
@Test
public void negativeTest()
{
	Assert.assertFalse(PrimeNumCheck.isprime(10));
	System.out.println("The numer is not a  prime");
}
}

