package day04;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class keyboard {
@Test	
	public void caozuo() throws InterruptedException, AWTException, IOException {
		//打开浏览器
	/*	System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//输入网址
		String url="file:///D:/2018%E8%AF%BE%E4%BB%B6/08%20Selenium/页面/index.html";
		driver.get(url);
		Thread.sleep(2000);
		WebElement a=driver.findElement(By.id("user"));
		Robot aa=new Robot();
		aa.keyPress(KeyEvent.VK_CONTROL);//按住ctrl
		aa.keyPress(KeyEvent.VK_S);	//按住s
*/		
	
	//FileHandler.copy(new File("D:\\2018课件\\08 Selenium\\day1"), new File("D:\\2018课件\\08 Selenium\\chuchu"),".docx");
	FileHandler.delete(new File("D:\\2018课件\\08 Selenium\\chuchu"));
}
}
