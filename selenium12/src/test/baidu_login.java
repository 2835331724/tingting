package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import static org.junit.Assert.assertArrayEquals;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class baidu_login {
	static WebDriver driver;
	static int i=1;
  @SuppressWarnings("deprecation")
  @DataProvider(name="login")
  public Object[][] Users(){
  return new Object[][]{
	  {"18982813906","1234567"},
	  {"123adsffdgs","pf0517520"},
	  {"        ","  "},
	  {"%&(*&(*","fjladskfjwo"},
	  {"18982813906","1433223"},
	  {"18982813906","hs19950810"},
  };
  }

@Test(dataProvider="login")
  public void f(String username,String password) throws InterruptedException {
	  Thread.sleep(3000);
		driver.findElement(By.id("TANGRAM__PSP_10__userName")).clear();
		driver.findElement(By.id("TANGRAM__PSP_10__userName")).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.id("TANGRAM__PSP_10__password")).clear();
		driver.findElement(By.id("TANGRAM__PSP_10__password")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.id("TANGRAM__PSP_10__submit")).click();
		Thread.sleep(3000);
	  String user=driver.findElement(By.xpath("//*[@id=\"s_username_top\"]/span")).getText();
	  Assert.assertNotEquals("µÇÂ¼", user);
	  
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"u1\"]/a[7]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("TANGRAM__PSP_10__footerULoginBtn")).click();
  }

  @AfterMethod
  public static  void afterMethod() throws InterruptedException {  
	  if(driver.findElement(By.id("TANGRAM__PSP_10__error")).isEnabled()) {
		  String error = driver.findElement(By.id("TANGRAM__PSP_10__error")).getText();			  
		  System.out.println(error);
		  File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(file, new File("F:\\"+i+".jpg"));
				i++;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  }
	  Thread.sleep(3000);
	  driver.navigate().refresh();
  }
	@BeforeSuite
	public static  void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\tools\\chromedriver.exe");
		driver = new  ChromeDriver();
		driver.get("https://www.baidu.com/");
	}

	@AfterSuite
	public static void tearDown() throws Exception {
		driver.quit();
	}

}
