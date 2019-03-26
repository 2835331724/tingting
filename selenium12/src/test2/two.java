package test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class two extends one {
	public static WebElement kk;
	public void ele() {
	kk=	driver.findElement(By.xpath("/html/body/div[10]/div[1]/div[3]/ul[2]/li[1]/a/b"));//¶¨Î»ÔªËØ
		
	}
}
