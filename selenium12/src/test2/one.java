package test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class one {
	public static WebDriver driver;
	public void a() {
	System.setProperty("webdriver.chrome.driver", ".\\tool\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get("https://www.sina.com.cn/");
}}
