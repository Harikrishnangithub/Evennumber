package org.numbers.test;

import org.openqa.selenium.By;

public class Numbers 
{
	
	public static void main(String[] args)
	{      
			String month = "January";
			String year = "2020";
			String text = driver.findElement(By.xpath("//span[text()='December']")).getText();
			String text1 = driver.findElement(By.xpath("//span[text()='2019']")).getText();
			if (text.equalsIgnoreCase("month")&&text1.equalsIgnoreCase("year")) 
			{
				driver.findElement(By.xpath("//a[@title='Next']")).click();
			}
			
		}
		}
}
