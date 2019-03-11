package hanjia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo3 {
	static WebDriver driver;
	static String url;
	@BeforeTest
	public  void setup()
	{
	System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
	driver=new ChromeDriver();
	url="http://localhost:8080/shop1/";
	}
	@Test
	public void login() {
		/*
		三、意见反馈
		登录--进入意见反馈--发表意见
		 */
		driver.get(url);
		//输入用户名，密码登录
		driver.findElement(By.name("c_name")).sendKeys("aaaaaa");
		driver.findElement(By.name("c_pass")).sendKeys("aaa");
		driver.findElement(By.xpath("/html/body/center[4]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/form/table/tbody/tr[5]/td/input[1]")).click();		
	}
	@Test
	public void yijian() {
		//点击意见反馈
		driver.findElement(By.linkText("意见反馈")).click();
		//发表意见
		driver.findElement(By.name("c_message")).sendKeys("质量堪忧");
		driver.findElement(By.xpath("/html/body/center[4]/form/table/tbody/tr[7]/td/input[1]")).click();
	}
}
