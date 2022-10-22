package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class c4 {

	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("file:///C:/Users/SIVA%20KUMAR/Desktop/d4.html");
			Thread.sleep(2000);
			driver.findElement(By.tagName("input")).clear();
		}
	
	}

