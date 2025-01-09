package org.data;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//String[] items = { "Calvin Klein Women's Alondra Sneaker","adidas Women's Vl Court 3.0"};
		WebElement search = driver.findElement(By.name("q"));
		Thread.sleep(1000);
		search.sendKeys("mobile phone");
		Robot enter = new Robot();
		enter.keyPress(KeyEvent.VK_ENTER);
		
		List<WebElement> list = driver.findElements(By.cssSelector("div.KzDlHZ"));
		
		for( int i =0;i<list.size();i++)
		{
			String text = list.get(i).getText();
			System.out.println(text);
			System.out.println("Print the cart");
			System.out.println("Print the cart1");
			System.out.println("Print the cart2");
		
		}
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//div[@class='col col-7-12']/child::div)[4]")).click();
			Set<String> parentwindow = driver.getWindowHandles();
			Iterator<String> window = parentwindow.iterator();
			String parentw = window.next();
			String child = window.next();
			driver.switchTo().window(child);
		JavascriptExecutor scrolldown =(JavascriptExecutor)driver;
		scrolldown.executeScript("window.scrollBy(0,2000)");
     	driver.findElement(By.xpath("(//button[contains(@class,'QqFHMw')])[1]")).click();
		
	}

}
