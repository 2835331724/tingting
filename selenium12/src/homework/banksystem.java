package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class banksystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\tool\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8080/Banksys_ssh/login.jsp");
		driver.findElement(By.xpath("//*[@id=\"loginValidate_userNO\"]")).sendKeys("1546338500155");
		driver.findElement(By.xpath("//*[@id=\"loginValidate_password\"]")).sendKeys("123456");
		driver.findElement(By.id("loginValidate_0")).click();
		
		
	    
	}

}
