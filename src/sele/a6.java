package sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class a6 {
	public static void main(String[] args) throws InterruptedException
	{System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/SIVA%20KUMAR/Desktop/T1.html");
	
	  List<WebElement> links=driver.findElements(By.xpath("//input")); 
	 for(WebElement value:links)
	 {
	 value.click();
	 Thread.sleep(1000);
	 }
	 for(WebElement value:links)
	 {
	 value.click();
	 Thread.sleep(1000);
	 }
	 
	}

}
