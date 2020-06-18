package tesngbasics;

import org.testng.annotations.Test;

public class RepeatTest {
	@Test(invocationCount = 10)
	public void loginTest() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("sum = "+c);
	}
}
