package selenium12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.w3c.dom.html.HTMLBaseElement;

public class one {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\tool\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.taobao.com");
		Thread.sleep(5000);
		WebElement element=driver.findElement(By.linkText("密码登录"));
		Thread.sleep(5000);
		driver.findElement(By.linkText("密码登录")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"TPL_username_1\"]")).sendKeys("账号");
		driver.findElement(By.xpath("//*[@id=\"TPL_password_1\"]")).sendKeys("密码");
		//driver.findElement(By.id("J_SubmitStatic")).click();
		Thread.sleep(5000);
		WebElement element2 =driver.findElement(By.xpath("//*[@id=\"nc_1_n1z\"]")); //定义第一个元素  
		WebElement target = driver.findElement(By.xpath("//*[@id=\"nc_1__scale_text\"]/span")); //定义第二个元素
		(new Actions(driver)).dragAndDrop(element2, target).perform();
		element=driver.findElement(By.xpath("//*[@id=\"nc_1__scale_text\"]/span"));
		 
		 (new Actions(driver)).dragAndDropBy(element,400,0).perform();
//		 Thread.sleep(5000);
//		 target = driver.findElement(By.xpath("//*[@id=\"nc_1__scale_text\"]/span"));
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

	private static Object Action(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}

}
