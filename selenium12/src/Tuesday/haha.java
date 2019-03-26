package Tuesday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class haha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\tool\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.baidu.com");
		driver.findElement(By.id("kw")).sendKeys("slenium");
		driver.findElement(By.id("su")).click();
	
	
	}

}
