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
//����ҳ
String url="http://flight.qunar.com";
System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get(url);
//ѡ�񡰵��̡�
driver.findElement(By.xpath("//*[@id=\"searchTypeSng\"]")).click();
//���뵽�����
driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[2]/div[2]/div/input")).sendKeys("����");
//ѡ��today+7�պ������
String date=driver.findElement(By.id("fromDate")).getText();
driver.findElement(By.id("fromDate")).clear();
driver.findElement(By.id("fromDate")).sendKeys(date+7);
//�㡰������,��ת����Ʊ���������б�ҳ��
driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[4]/button")).click();
//���б�ҳͣ��1���ӣ�����ҳ���ϳ��֡�����������
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
/* 
������ֺ����б����ڳ��֡�ÿ�κ���������˰�ѡ����������ѡ����Ʊ����ť����չ�����б��л���֡���һ�̡��� ���ڶ��̡�������û�г��֡�ÿ�κ���������˰�ѡ����������ѡ����Ʊ����ť����չ�����б�ײ��л���֡����۷�Χ��
��������ֺ����б���ҳ�����֡��ú��ߵ�ǰ�޿��ۺ��ࡱ
*/
driver.findElement(By.xpath("(//div[@class='avt_trans']//p[contains(text(),'ÿ�κ���������˰��')]/ancestor::div//div[@class='a_booking']/a)[3]")).click();
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
