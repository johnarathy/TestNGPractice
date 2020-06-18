package tesngbasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicTrial {
	
	@BeforeSuite
	public void setUp() {
		System.out.println("setup system property for chrome");
	}
	@BeforeTest
	public void launchBrowser() {
		System.out.println("launch chrome Browser");
	}
	@BeforeClass
	public void enterUrl() {
		System.out.println("enter URL");
	}
	@BeforeMethod //used as setup
	public void login() {
		System.out.println("login to app");
	}
	@Test(priority=3,groups="logo")
	public void googleTitleTest() {
		System.out.println("Google title test###");
	}
	@Test(priority=4,groups="title")
	public void googleThistest() {
		System.out.println("Google this test????");
	}
	@Test(priority=2,groups="title")
	public void googleSomeTest() {
		System.out.println("Google some test...");
	}
	@Test(priority=1,groups="logo")
	public void googleNametest() {
		System.out.println("Google name test***");
	}
	@AfterMethod //used as teardown
	public void logout() {
		System.out.println("logout from app");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("closing browser");
	}
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("delete all cookies");
	}
	@AfterSuite
	public void genTestReport() {
		System.out.println("generate test report");
	}
}
