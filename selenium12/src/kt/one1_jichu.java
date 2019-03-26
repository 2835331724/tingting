package kt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class one1_jichu {
public static WebDriver driver;
	public void a() {
	System.setProperty("webdriver.chrome.driver", ".\\tool\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get("http://www.baidu.com");
	}
}
