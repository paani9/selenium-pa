package sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class a5 {
	public static void main(String[] args) throws InterruptedException
	{System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.flipkart.com");
	
	  List<WebElement> links=driver.findElements(By.xpath("//a")); 
	 for(WebElement value:links)
	 {String text=value.getText();
	 System.out.println(text);
	 }
	}

}
