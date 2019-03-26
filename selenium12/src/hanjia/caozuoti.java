package hanjia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class caozuoti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\tool\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://flight.qunar.com");
		driver.findElement(By.id("searchTypeSng")).click();//单程
//		driver.findElement(By.id("searchTypeRnd")).click();//往返
		//清空输入框
//		WebElement element=driver.findElement(By.xpath("//*[@id=\\\"dfsForm\\\"]/div[2]/div[1]/div/input"));
//		element.clear();
        driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/div[1]/div/input"));//出发城市
        
        driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/div[2]/div/input")).sendKeys("上海");//到达城市
		
		
		
		
		
	}

}
