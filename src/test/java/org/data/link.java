package org.data;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class link {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement links = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		List<WebElement> list = links.findElements(By.tagName("a"));
		System.out.println(list.size());
		for(int i =0;i<list.size();i++)
		{
			String click = Keys.chord(Keys.CONTROL,Keys.ENTER);
			list.get(i).sendKeys(click);
			
			Set<String> windowHandles = driver.getWindowHandles();
			Iterator<String> it = windowHandles.iterator();
			
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			
		}
		
		
	}

}
