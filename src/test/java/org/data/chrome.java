package org.data;

import org.openqa.selenium.chrome.ChromeDriver;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class chrome {
	
	public static void main(String[] args) throws IOException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\cchokkalingam_dev\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		int j = 0;
		String[] itemsNeeded= {"Cauliflower","Beetroot","Cucumber","Carrot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		//To list out the items use below query
		
		List<WebElement> items = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i =0;i<items.size();i++)
		{
			String[] split = items.get(i).getText().split("-");
			String formatedname = split[0].trim();
			List<String> asList = Arrays.asList(itemsNeeded);
		if(asList.contains(itemsNeeded))
		{
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			if(j==itemsNeeded.length)
			{
				break;
			}
			
		}
		
		
		
		
		
		
      

		
		
}

	}
}


