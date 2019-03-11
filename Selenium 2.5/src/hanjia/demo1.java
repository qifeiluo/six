package hanjia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo1 {
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
	public void sousuo() {
		/*
		 * 前台：
		一、搜索
		用商品类型搜索
		用商品名搜索
		用商品类型和商品名精确搜索
		 */
		driver.get(url);
		//选着商品类型
		WebElement a=driver.findElement(By.name("select_type"));
		Select s1=new Select(a);
		s1.selectByVisibleText("电脑专区");
		//输入商品名
		driver.findElement(By.name("select_p_name")).sendKeys("联想");
		//点击搜索
		driver.findElement(By.name("Submit")).click();
	
	}
	
}
