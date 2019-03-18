package openbaidu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class openbaidu {
	public static WebDriver driver;
	public static String url;
	@Test
	public void setup() {
		//´ò¿ªä¯ÀÀÆ÷
		System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		driver=new ChromeDriver();
		//ÊäÈëÍøÖ·
		url="https://www.baidu.com";
		driver.get(url);
		
		driver.findElement(By.id("kw")).sendKeys("Èí¼ş²âÊÔ");
		driver.findElement(By.id("su")).click();
	}
}
