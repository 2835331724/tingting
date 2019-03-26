//package hanjia;
//
//public class test {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
package hanjia;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

public static void main(String[] args) {
//打开网页
String url="http://flight.qunar.com";
System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get(url);
//选择“单程”
driver.findElement(By.xpath("//*[@id=\"searchTypeSng\"]")).click();
//输入到达城市
driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/div[2]/div/input")).sendKeys("北京");
//选择today+7日后的日期
String date=driver.findElement(By.id("fromDate")).getText();
driver.findElement(By.id("fromDate")).clear();
driver.findElement(By.id("fromDate")).sendKeys(date+7);
//点“搜索”,跳转到机票单程搜索列表页。
driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[4]/button")).click();
//在列表页停留1分钟，至到页面上出现“搜索结束”
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
/* 
如果出现航班列表，对于出现“每段航班均需缴纳税费”的行随机点选“订票”按钮，在展开的列表中会出现“第一程”、 “第二程”；对于没有出现“每段航班均需缴纳税费”的行随机点选“订票”按钮，在展开的列表底部中会出现“报价范围”
如果不出现航班列表，则页面会出现“该航线当前无可售航班”
*/
driver.findElement(By.xpath("(//div[@class='avt_trans']//p[contains(text(),'每段航班均需缴纳税费')]/ancestor::div//div[@class='a_booking']/a)[3]")).click();
driver.findElement(By.xpath("//div[@id='flightbarXI883']//div[@class='t_bk']/a")).click();
}

public static String getDateAfterToday(int dateAfterToday) {
Calendar c = Calendar.getInstance();
c.add(Calendar.DATE, +dateAfterToday);
System.out.println(c.getTime().toString());
java.util.Date date = c.getTime();
SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
System.out.println(d.format(date));
return d.format(date);
}
public static boolean isElementPresent(WebDriver driver, final By by,
int timeOut) throws InterruptedException {
boolean isPresent = false;
Thread.sleep(timeOut * 100);
List w = (List) driver.findElements(by);
if (w.size() != 0) {
isPresent = true;
}
return isPresent;
}

}
