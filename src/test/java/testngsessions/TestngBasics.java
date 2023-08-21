package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngBasics {
	
	// testNG is a java unit Testing framework
	// it is a tool,framework,library which is used to write test cases
 // TestNg is all about writing the annotations
	// write some global preconditions like
	// server is running, database is up,application is up and running
	
// pre conditions example like I want to check something after Login the 
// pre condition in this case is that the user should be logged in
	


// test step(test cases) + expected result vs actual result
// post steps are those which are done once you are done execution of the test case ex deleting a user,closing the db connection
// Whenever an annotation is written it should be associated with a method
@BeforeSuite
public  void connectWithDB() {
	System.out.println("In the before suite annotation");
}

@BeforeTest
public void createUser() {
	System.out.println("This is before test annotation");
}
@BeforeClass
public void launchBrowser() {
	System.out.println("This is before class annotation");
}
@BeforeMethod
public void login() {
	System.out.println("This is Before method annotation");
}
	
@Test	
public void homePageTest() {
	System.out.println("This is the test annotation");
}

@Test	
public void seacrhPageTest() {
	System.out.println("This is the test annotation for search page test");
}
@Test	
public void addToCart() {
	System.out.println("This is the test annotation for add to cart page test");
}
@AfterMethod()
public void logout() {
	System.out.println("This is after method annotation");
	
}

@AfterClass
public void closeBrowser() {
	System.out.println("This is after class annoation to closee the browser");
}
@AfterTest
public void deleteUser() {
	System.out.println("this is after test annotation to delete user");
}
@AfterSuite
public void disconnectDB() {
	System.out.println("This is the after suite annotation close the db connection");
}


	
	
}