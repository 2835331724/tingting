package haha;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

//public class testng {
//	  @Parameters("test")
//  @Test
//
//  public void f( String test) {
//	  System.out.println(test);
//  }
//	  @Test(dependsOnMethods="f")
//
//	  public void f1( String test) {
//		  System.out.println(test);
//	  }
	  public class testng{
		  @DataProvider
		  public Object[][] user(){
			return new Object[][] {
				{"zangsan","12"},{"lisi","15"}
			};
			  
		  }
		  @Test(dataProvider="user")
		  public void ff(String a,String b) {
			  System.out.println(a+""+b);
		  }
	  }
//  @BeforeMethod
//  public void beforeMethod() {
//	  System.out.println("2");
//  }
//
//  @AfterMethod
//  public void afterMethod() {
//	  System.out.println("3");
//  }
//
//  @BeforeClass
//  public void beforeClass() {
//	  System.out.println("4");
//  }
//
//  @AfterClass
//  public void afterClass() {
//	  System.out.println("5");
//  }
//
//  @BeforeTest
//  public void beforeTest() {
//	  System.out.println("6");
//  }
//
//  @AfterTest
//  public void afterTest() {
//	  System.out.println("5");
//  }
//
//  @BeforeSuite
//  public void beforeSuite() {
//	  System.out.println("4");
//  }
//
//  @AfterSuite
//  public void afterSuite() {
//	  System.out.println();
//  }


