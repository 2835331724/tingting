package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class zhouce {
	  @DataProvider(name="username")
	  public Object[][] Users(){
	  	
	  return new Object[][]{
	  {"1585490872","123"},
	  {"1585490877","  "},
	  {"18982813906","hs19950810"}
	  };
	  }
	  @Test(dataProvider="username")
	public static void main(String a,String v) throws Exception {
		// TODO Auto-generated method stub
		  int i=1;
		System.setProperty("webdriver.chrome.driver",".\\tool\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.baidu.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"u1\"]/a[7]")).click();
		Thread.sleep(3000);
//		WebElement element=driver.findElement(By.linkText("用户名登录"));
//		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__footerULoginBtn\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__userName\"]")).sendKeys(a);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__password\"]")).sendKeys(v);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__submit\"]")).click();
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"pass_phoenix_btn\"]/ul/li[1]/a")).click();
		//截图
		/*File screenShotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(screenShotFile, new File("F:/test.png"));	
		}catch(IOException e) {
			e.printStackTrace();
		}*/
		//用于判断是否登入
		boolean b = driver.findElement(By.xpath("//*[@id=\"u1\"]/a[7]")).isDisplayed();
		if(b) {
			File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(file,new File("F:/zouce"+i+".jpg"));
			}catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("登入成功!");
		}
		i++;
  }
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
  }

  @AfterTest
  public void afterTest() {
  }
		}
	


