package tesngbasics;

import org.testng.annotations.Test;

public class FeaturesTest {
	@Test()
	public void loginTest() {
		System.out.println("login test????");
		int a = 9/0;
	}
	@Test(dependsOnMethods = "loginTest")
	public void homePageTest() {
		System.out.println("homePage test...");
	}
	@Test(dependsOnMethods = "loginTest")
	public void logoutTest() {
		System.out.println("logout test***");
	}
}
