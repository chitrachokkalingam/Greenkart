package org.data;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hilton {
	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.stg.hilton.com/");
		WebElement destination = driver.findElement(By.xpath("//input[@placeholder ='Search for a destination']"));
		destination.sendKeys("Las Vegas");
		Robot enter = new Robot();
		enter.keyPress(KeyEvent.VK_ENTER);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		JavascriptExecutor dropdown =(JavascriptExecutor) driver;
		dropdown.executeScript("window.scrollby(0,2000)");
		driver.findElement(By.xpath("(//a[text()='Select Dates'])[1]")).click();
		driver.findElement(By.xpath("//button[@id='1']")).click();
		driver.findElement(By.xpath("//span/span[text()='$254']")).click();
		
		
		
		
	}

}
